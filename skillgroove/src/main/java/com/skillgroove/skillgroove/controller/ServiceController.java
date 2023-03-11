package com.skillgroove.skillgroove.controller;



import com.skillgroove.skillgroove.models.Descriptor;
import com.skillgroove.skillgroove.models.DescriptorType;
import com.skillgroove.skillgroove.models.Service;
import com.skillgroove.skillgroove.models.TextDescriptor;
import com.skillgroove.skillgroove.models.ColorDescriptor;
import com.skillgroove.skillgroove.models.ImageDescriptor;
import com.skillgroove.skillgroove.repository.DescriptorRepository;
//import com.skillgroove.skillgroove.repository.DescriptorRepository;
import com.skillgroove.skillgroove.repository.ServiceRepository;
//import com.skillgroove.skillgroove.service.DescriptorDTO;
//import com.skillgroove.skillgroove.service.ServiceDTO;

import java.util.ArrayList;
import java.util.List;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)


@RestController
@RequestMapping("/services")
public class ServiceController {
    
    @Autowired
    private ServiceRepository serviceRepository;
    
    @Autowired
    private DescriptorRepository descriptorRepository;
    
    @PostMapping("/save")
    public ResponseEntity<Void> createService(@RequestBody Service service) {
        List<Descriptor> savedDescriptors = new ArrayList<>();

        for (Descriptor descriptor : service.getDescriptors()) {
        	
        
        	for (int i = 1; i <= descriptor.getQuantity(); i++) {
                DescriptorType value;
                if (descriptor.getType().getClass().equals(TextDescriptor.class)) {
//                    value = new TextDescriptor("Text value " + i);
                	
//                	String myValue= TextDescriptor.getValue();
                	value =new TextDescriptor();
                	value.getValue();          
            
                    
                } else if (descriptor.getType().getClass().equals(ColorDescriptor.class)) {
                	value =new TextDescriptor();
                	value.getValue(); 
                } else if (descriptor.getType().getClass().equals(ImageDescriptor.class)) {
                	value =new TextDescriptor();
                	value.getValue(); 
                } else {
                    throw new IllegalArgumentException("Invalid descriptor type");
                }
//                descriptor.addValue(value);
            }
        	
        	
        	
          savedDescriptors.add(descriptorRepository.save(descriptor));
        }

        service.setDescriptors(savedDescriptors);
        serviceRepository.save(service);

        return ResponseEntity.status(HttpStatus.CREATED).build();
      
    
//
//    public ResponseEntity<?> createService(@RequestBody Service service) {
//        Service savedService = serviceRepository.save(service);
//        return ResponseEntity.ok(savedService);
//    }

    // ...
    
}
    
    @GetMapping("/{id}")
    public Service getService(@PathVariable String id) {
        return serviceRepository.findById(id).orElse(null);
    }
    
    @GetMapping("/all")
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}
