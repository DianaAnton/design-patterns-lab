package ro.uvt.services;

import ro.uvt.models.*;


public class JPGImageLoader implements ImageLoader {

	@Override
	public ImageContent load(String img) {
		// TODO Auto-generated method stub
		System.out.println("Creating JPG image");
		return new ImageContent(img);
	}

}
