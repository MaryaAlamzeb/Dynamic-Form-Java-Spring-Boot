package com.skillgroove.skillgroove.controller;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.skillgroove.skillgroove.models.User;
import com.skillgroove.skillgroove.repository.UserRepository;

@RestController
@CrossOrigin(origins= "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	@PostMapping("/addUser")
	
	public String saveUser(@RequestBody User user)
	{
		SecureRandom secureRandom = new SecureRandom();
		int randomWithSecureRandom = secureRandom.nextInt();

	
		user.setId(randomWithSecureRandom);
		repository.save(user);
		
		return "User added with : " +user.getId() ;
		
	}
	
	
	@GetMapping("/findAllUser")
public List<User> getUsers()
{
	return repository.findAll();
	
}
	
	@GetMapping("/findAllUser/{id}")
	public Optional<User> getUser(@PathVariable int id)
	{
		return repository.findById(id);
	}
	
	
	@DeleteMapping("/DelteAUser/{id}")
	public String deleteUser(@PathVariable int id)
	{
		repository.deleteById(id);
		return "User deleted with id "+id ;
	}
	
	@PutMapping("/UpdateUser/{id}")
	public User update( @PathVariable int id, @RequestBody User newUser) {
        // Only update an item if it can be found first.
        return repository.findById(id)
                .map(user -> {
                	
                	user.setName(newUser.getName());
                	user.setEmail(newUser.getEmail());
                	user.setPassword(newUser.getPassword());
                	user.setPhone_number(newUser.getPhone_number());
                	user.setAddress(newUser.getAddress());
                	user.setGender(newUser.getGender());
                	
                return repository.save(user);
                  
                }).orElseThrow(()->new  ArithmeticException());
    }
	
	
	
}
