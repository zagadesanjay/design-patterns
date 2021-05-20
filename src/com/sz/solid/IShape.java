package com.sz.solid;

public interface IShape {

	public double calculateArea();
	
	public double calculateVolume();
	
}

class Cuboid implements IShape{

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Square implements IShape{

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateVolume() {
		// unnecessarily this method have to implement here 
		// have client specific interfaces so that only specifc methods only can implemented 
		
		return 0;
	}
	
}

// Solution 
// Segregate Shape into TwoDimentionalShape and ThreeDimentionalShape
// Cuboid implements TwoDimentionalShape, ThreeDimentionalShape
// Square implements TwoDimentionalShape

