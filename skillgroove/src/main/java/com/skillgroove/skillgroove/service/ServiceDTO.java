package com.skillgroove.skillgroove.service;

import java.math.BigDecimal;
import java.util.List;

public class ServiceDTO {
		private String name;
		private String image;
		private BigDecimal price;
		private String type;
		private String description;
		private List<DescriptorDTO> descriptors;
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
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<DescriptorDTO> getDescriptors() {
			return descriptors;
		}
		public void setDescriptors(List<DescriptorDTO> descriptors) {
			this.descriptors = descriptors;
		}
		
		
		
	}
	
	
