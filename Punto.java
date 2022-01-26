package punto;

import java.lang.Math;

public class Punto {
	private int x;
	private int y;
	
	public Punto(){
		x=0;
		y=0;
	}
	
	public Punto(int x1,int y1) {
		x=x1;
		y=y1;
	}
	
	public void setX(int x1) {
		x=x1;
	}
	
	public void setY(int y1) {
		y=y1;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void trasla(int dx,int dy) {
		x=dx+x;
		y=dy+y;
	}
	
	public double distanza(Punto p){
		x=getX();
		y=getY();
		x=x-p.x;
		y=y-p.y;
		double d = Math.sqrt((x*x)+(y*y));
		return d;
	}
}
