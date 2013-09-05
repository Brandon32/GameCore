package com.twoshotgaming.gamecore.model;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Sprite {

	private BufferedImage image = null;
	private int maxImages = 1;
	private int x = 0;
	private int y = 0;
	private Point position = new Point(x,y);
	private int xPrevous = 0;
	private int yPrevous = 0;
	private Point prevous = new Point(xPrevous,yPrevous);
	private Point boundingBox = new Point(0,0);
	
	public Sprite(BufferedImage image){
		this.image = image;
		boundingBox.x = image.getWidth();
		boundingBox.y = image.getHeight();
	}
	
	public Sprite(BufferedImage image, int maxImages){
		this.image = image;
		this.maxImages = maxImages;
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getMaxImages() {
		return maxImages;
	}

	public void setMaxImages(int maxImages) {
		this.maxImages = maxImages;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		xPrevous = this.x;
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		yPrevous = this.y;
		this.y = y;
	}

	public int getXPrevous() {
		return xPrevous;
	}

	public int getYPrevous() {
		return yPrevous;
	}

	public Point getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(Point boundingBox) {
		this.boundingBox = boundingBox;
	}
	
}
