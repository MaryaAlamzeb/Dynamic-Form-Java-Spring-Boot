package com.skillgroove.skillgroove.service;

import java.util.List;

public class ImageDescriptorDTO extends DescriptorDTO {
	// additional fields for image descriptor
	private List<String> images;

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	

}
