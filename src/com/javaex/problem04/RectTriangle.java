package com.javaex.problem04;

public class RectTriangle extends Shape{
	
	double width;
	double height;
	
	
	
	public RectTriangle(double w, double h){
		super(3);
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width*height*0.5;
	}

	@Override
	public double getPerimeter() {
		return width+height+ Math.sqrt(Math.pow(width, height)); //Math.pow: 제곱값
	}

}
