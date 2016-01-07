public class Cone implements Shape3D{
  	private double radius;
  	private double height;
  	public Cone(double radius, double height){ //constructor
        	this.radius = radius;
        	this.height = height;
  	}
  	public double getVolume(){ //returns volume
        	return Math.PI*radius*radius*height*(1/3);
  	}
  	public double getSurfaceArea(){ //returns surface area
        	return Math.PI*radius*radius + Math.PI*radius*Math.sqrt(radius*radius + height*height);
  	}
  	public double getSlandHeight(){
        	return Math.sqrt(radius*radius + height*height);
  	}
  	public double getRadius(){
        	return this.radius;
  	}
  	public double getHeight(){
        	return this.height;
  	}
}
