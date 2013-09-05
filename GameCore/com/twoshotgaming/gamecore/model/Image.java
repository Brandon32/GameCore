package com.twoshotgaming.gamecore.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Image {

	private static ArrayList<Sprite> sprites;

	public Image() {

		sprites = new ArrayList<Sprite>();
		
	}

	public static void addSprite(File imageFile) throws IOException{
		
		sprites.add(new Sprite(loadBufferedImage(imageFile)));
	}
	
	public static BufferedImage loadBufferedImage(File file)	throws IOException {

		if (file != null) {
			return ImageIO.read(file);
		} else {
			throw new IOException("Unable to find file: " + file);
		}
	}
}
