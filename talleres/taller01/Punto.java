
public class Punto {
	private double x, y;


    public Punto (double x, double y) 
    {
    	this.x=x;
    	this.y=y;
    }
    public double x() 
    {
    	return x;
    }
    public double y() 
    {
    	return y;
    }    
    public double radioPolar() {
    	double radiop = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    	return radiop;
    }
    public double anguloPolar()
    {
    	double angulop	= Math.atan(y/x);
    	return angulop;
    }
    public double distanciaEuclidiana(Punto otro) {
        double distanciax = x-otro.x;
        double distanciay = y-otro.y;
        double distanciae= Math.sqrt(Math.pow(distanciax, 2)+Math.pow(distanciay, 2));
        return distanciae;
    }

}
