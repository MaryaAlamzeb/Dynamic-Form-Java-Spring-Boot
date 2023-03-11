package com.skillgroove.skillgroove.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillgroove.skillgroove.models.ColorDescriptor;
import com.skillgroove.skillgroove.models.ImageDescriptor;
import com.skillgroove.skillgroove.models.TextDescriptor;
import com.skillgroove.skillgroove.models.Descriptor;
import com.skillgroove.skillgroove.models.DescriptorType;
import com.skillgroove.skillgroove.repository.DescriptorRepository;

@RestController
@RequestMapping("/descriptors")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DescriptorController {
	
	DescriptorType descriptorType;
    @Autowired
    private DescriptorRepository descriptorRepository;
    
    @PostMapping("/add")
    public Descriptor createDescriptor(@RequestBody Descriptor descriptor) {
//    	System.out.println(descriptor.getName());
//    	System.out.println(descriptor.getType());
    	
//    	if (descriptor.getType()=="color")
//
//    	{
//    		descriptorType=new ColorDescriptor();
////    		descriptorType.setColorValues();
//    	}
//    	
//        return descriptorRepository.save(descriptor);
    	
    	// public List<DescriptorType> getValues() {
//        return values;
//    }
    	
    	for (int i = 1; i <= descriptor.getQuantity(); i++) {
            DescriptorType value;
            if (descriptor.getType().getClass().equals(TextDescriptor.class)) {
//                value = new TextDescriptor("Text value " + i);
            	
//            	String myValue= TextDescriptor.getValue();
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
//            descriptor.addValue(value);
        }
        return descriptorRepository.save(descriptor);
    }
    
    @GetMapping("/get")
    public List<Descriptor> getDescriptors() {
        return descriptorRepository.findAll();
    }
}
