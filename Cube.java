public class Cube implements Shape3D{
  	private double side;
  	public Cube(double side){ //constructor
        	this.side = side;
  	}
  	public double getVolume(){ //returns volume
        	return side*side*side;
  	}
  	public double getSurfaceArea(){ //returns surface area
        	return side*side*6;
  	}
  	public double getSide(){ //returns length of side
        	return this.side;
  	}
}
