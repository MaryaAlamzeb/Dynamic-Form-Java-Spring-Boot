package com.skillgroove.skillgroove.service;

import java.util.List;

public class ColorDescriptorDTO extends DescriptorDTO {
	// additional fields for color descriptor
	private List<String> colors;

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	
	

}