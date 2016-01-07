public class RectangularPrism implements Shape3D{
  	private double length;
  	private double width;
  	private double height;
//constructor
  	public RectangularPrism(double length, double width, double height){	
        	this.length = length;
        	this.width = width;
        	this.height = height;
  	}
  	public double getVolume(){ //returns volume
        	return length*width*height;
  	}
  	public double getSurfaceArea(){ //returns surface area
        	return (2*length*width)+(2*length*height)+(2*width*height);
  	}
  	public double getLength(){
        	return this.length;
  	}
  	public double getWidth(){
        	return this.width;
  	}
  	public double getHeight(){
        	return this.height;
  	}
}
