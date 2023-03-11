package com.skillgroove.skillgroove.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
//
//@JsonTypeName("ImageDescriptor")
//
//public class ImageDescriptor implements DescriptorType {
//    
//	private String[] imageValues;
//	
//	
//public String[] getType() {
//		return imageValues;
//	}
//
//	public void setImageValues(String[] imageValues) {
//		this.imageValues = imageValues;
//	}
//
//	
//	
//	
//	
//	//    private int quantity;
////    
////    public String getType() {
////        return "image";
////    }
//
////	public int getQuantity() {
////		return quantity;
////	}
////
////	public void setQuantity(int quantity) {
////		this.quantity = quantity;
////	}
//    
//    // constructors, getters, and setters
//    
//    
//public ImageDescriptor() {
//		
//	}
//    
//    
//    
//    // ...
//    
//}

import com.fasterxml.jackson.annotation.JsonSubTypes;


//@JsonTypeInfo(
//	    use = JsonTypeInfo.Id.NAME,
//	    include = JsonTypeInfo.As.PROPERTY,
//	    property = "__typename",
//	    defaultImpl = ImageDescriptor.class
//	)
//	@JsonSubTypes({
//	    @JsonSubTypes.Type(value = ImageDescriptor.class, name = "image")
//	})
public class ImageDescriptor implements DescriptorType {
    private String url;

    private String type="image";
    
    
    public ImageDescriptor(String url) {
        this.url = url;
    }
    
  public ImageDescriptor() {
	
}
  
  public void setValue(String url) {
      this.url = url;
  }
    @Override
    public String getValue() {
        return this.url;
    }
}


