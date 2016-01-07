public class Cylinder implements Shape3D{
  	private double radius;
  	private double height;
  	public Cylinder(double r, double h){ //constructor
        	this.radius = r;
        	this.height = h;
  	}
  	public double getVolume(){ //returns volume
        	return (Math.PI)*radius*radius*height;
  	}
  	public double getSurfaceArea(){ //returns surface area
        	return 2*(Math.PI)*radius*height;
  	}
  	public double getRadius(){
  	  	return this.radius;
  	}
  	public double getHeight(){
        	return this.height;
  	}
}

