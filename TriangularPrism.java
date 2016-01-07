public class TriangularPrism implements Shape3D{
  	private double triangleSide; //assume equilateral
  	private double length;
  	public TriangularPrism(double triangleSide, double length){ //constructor
        	this.triangleSide = triangleSide;
        	this.length = length;
  	}
  	public double getVolume(){ //returns volume
        	return (Math.sqrt(3) / 4) * triangleSide * triangleSide * length;
  	}
  	public double getSurfaceArea(){ //returns surface area
        	double areaOfTriangle = (Math.sqrt(3)/4) * triangleSide *	triangleSide;
        	double areaOfRectangle = triangleSide * length;
        	return (2 * areaOfTriangle + 3 * areaOfRectangle);	
  	}
  	public double getSide(){
        	return this.triangleSide;
  	}
  	public double getLength(){
        	return this.length;
  	}
}
