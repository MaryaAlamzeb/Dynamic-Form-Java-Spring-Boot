package com.skillgroove.skillgroove.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



@Document(collection = "Service")
public class Service {
    
    @Id
    private String id;
    
    private String name;
    
    private String image;
    
    private double price;
    
    private String description;
    
    private String type;
    
    private List<Descriptor> descriptors;
    
    
    
    public  Service()
    {
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

public String getDescription() {
	return description;
}
	public void setDescription(String description) {
	this.description = description;
}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Descriptor> getDescriptors() {
		return descriptors;
	}

	public void setDescriptors(List<Descriptor> descriptors) {
		this.descriptors = descriptors;
	}
    
    
    
    // constructors, getters, and setters
    
  
    
}

