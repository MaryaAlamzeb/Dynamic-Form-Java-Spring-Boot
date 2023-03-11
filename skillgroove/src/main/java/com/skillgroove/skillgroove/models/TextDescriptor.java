package com.skillgroove.skillgroove.models;

import com.fasterxml.jackson.annotation.JsonTypeName;


//
//public class TextDescriptor implements DescriptorType {
//    
////    private int quantity;
//    
//	private String[] textValues;
//	
//	
//	public String[] getType() {
//			return textValues;
//		}
//
//		public void setTextValues(String[] textValues) {
//			this.textValues = textValues;
//		}
//		
////	public int getQuantity() {
////		return quantity;
////	}
////
////	public void setQuantity(int quantity) {
////		this.quantity = quantity;
////	}
//    
//public TextDescriptor() {
//		
//	}
//    
//    
//}
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public class TextDescriptor implements DescriptorType {
    private String text;
    
    private String type="text";
    

public TextDescriptor(String text) {
        this.text = text;
    }
    
    public TextDescriptor()
    {
    	
    }
    
    public void setValue(String text)
    {
    	 this.text = text;
    }

    @Override
    public String getValue() {
        return this.text;
    }
    
    
    
}