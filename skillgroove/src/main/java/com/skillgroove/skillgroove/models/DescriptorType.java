package com.skillgroove.skillgroove.models;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.skillgroove.skillgroove.models.Descriptor;


@JsonTypeInfo(
		
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
//   defaultImpl = ColorDescriptor.class
)

@JsonSubTypes({
    @JsonSubTypes.Type(value = TextDescriptor.class, name = "text"),
    @JsonSubTypes.Type(value = ColorDescriptor.class, name = "color"),
    @JsonSubTypes.Type(value = ImageDescriptor.class, name = "image"),
  
})
public interface  DescriptorType {
//	
//	public static final Descriptor d = new Descriptor();
//	DescriptorType type= d.getType();
    public  abstract String getValue();
    

}