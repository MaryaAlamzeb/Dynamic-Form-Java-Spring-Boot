package com.skillgroove.skillgroove.models;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;



public class ColorDescriptor implements DescriptorType {
    private String color;

    private String type="color";
    
    public ColorDescriptor() {
		
	}
    
    
    public ColorDescriptor(String color) {
        this.color = color;
    }

    public void setValue(String color) {
        this.color = color;
    }
    
    @Override
    public String getValue() {
        return this.color;
    }
}