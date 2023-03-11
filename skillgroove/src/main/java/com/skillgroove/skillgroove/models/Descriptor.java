package com.skillgroove.skillgroove.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.skillgroove.skillgroove.controller.DescriptorController;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.databind.annotation.*;
//
//@Document(collection = "Descriptor")
//public class Descriptor {
//
//    private String name;
//
//    private String type;
//
//    private List<String> values;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public List<String> getValues() {
//        return values;
//    }
//
//    public void setValues(List<String> values) {
//        this.values = values;
//    }
//}

//public abstract class Descriptor {
//    private String name;
//    private int quantity;
//
//    public abstract String getType();
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//    // getters and setters
//}


//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//
//@JsonDeserialize(using = DescriptorDeserializer.class)
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.springframework.data.annotation.Id;
@Document(collection = "Descriptor")
//@JsonDeserialize(as = DescriptorController.class)
//@JsonSubTypes(
//{
//    @Type(value = TextDescriptor.class, name = "TextDescriptor"),
//    @Type(value = ColorDescriptor.class, name = "ColorDescriptor"),
//        @Type(value = ImageDescriptor.class, name = "ImageDescriptor")
//})
//public  class Descriptor {
//	
//	
//	
//	    @Id
//	    private String id;
//	    private String name;
//	    private int quantity;
////	    private DescriptorType type;
//	    private String type;
//		public String getId() {
//			return id;
//		}
//		public void setId(String id) {
//			this.id = id;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public int getQuantity() {
//			return quantity;
//		}
//		public void setQuantity(int quantity) {
//			this.quantity = quantity;
//		}
////		public DescriptorType getType() {
////			return type;
////		}
////		public void setType(DescriptorType type) {
////			this.type = type;
////		}
//	   
//
//public String getType() {
//	return type;
//}
//public void setType(String type) {
//	this.type = type;
//}
//
//public Descriptor()
//{
//
//    
//}
//
//}
	
public class Descriptor {
    @Id
    private String id;
    private String name;
    private int quantity;
    private String requiredInputType;
    private DescriptorType type;
    private List<DescriptorType> values;
  
    public Descriptor() {
        this.values = new ArrayList<>();
    }

    public Descriptor(String name, int quantity, String requiredInputType, DescriptorType type) {
        this.name = name;
        this.quantity = quantity;
        this.requiredInputType=requiredInputType;
        this.type = type;
        
        
        this.values = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DescriptorType getType() {
        return type;
    }

    public void setType(DescriptorType type) {
        this.type = type;
    }

    public List<DescriptorType> getValues() {
        return values;
    }

    public void setValues(List<DescriptorType> values) {
        this.values = values;
    }
    
//    public List<String> setValuess(List<String> valuess)
//    {
//    	this.valuess=valuess;
//    }

    public void addValue(DescriptorType value) {
        this.values.add(value);
    }

    public String getRequiredInputType() {
		return requiredInputType;
	}

	public void setRequiredInputType(String requiredInputType) {
		this.requiredInputType = requiredInputType;
	}

	public void removeValue(DescriptorType value) {
        this.values.remove(value);
    }
    
    

    @Override
    public String toString() {
        return "Descriptor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", type=" + type.getClass().getSimpleName() +
                ", values=" + values +
                '}';
    }
}


