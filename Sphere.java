public class Sphere implements Shape3D{
  	private double radius; 
  	public Sphere(double radius){ //constructor
        	this.radius = radius;
  	} 	
  	public double getVolume(){ //returns volume
        	return (4/3)*(Math.PI)*radius*radius*radius;
  	}
  	public double getSurfaceArea(){ //returns surface area
        	return 4*(Math.PI)*radius*radius;
  	}
  	public double getRadius(){
        	return this.radius;
  	}
}
