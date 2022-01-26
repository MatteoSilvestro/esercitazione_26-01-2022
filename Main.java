package punto;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		String dato="";
		int x=0,y=0,dx=0,dy=0;
		
	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera= new BufferedReader (input);
		
	    //1

		try {
			System.out.println("Inserire le coordinate del punto P: ");
			dato=tastiera.readLine();
			x=Integer.valueOf(dato).intValue();
			dato=tastiera.readLine();
			y=Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		Punto P0 = new Punto(x,y);
			
		//2
		
		try {
			System.out.println("Inserire i delta: ");
			dato=tastiera.readLine();
			dx=Integer.valueOf(dato).intValue();
			dato=tastiera.readLine();
			dy=Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		P0.trasla(dx,dy);
		
		System.out.println("Nuova coordinata x = "+P0.getX());
		System.out.println("Nuova coordinata y = "+P0.getY());
		
		//3
		
		Punto P1 = new Punto();
		
		try {
			System.out.println("Inserire le coordinate del punto P1: ");
			dato=tastiera.readLine();
			x=Integer.valueOf(dato).intValue();
			dato=tastiera.readLine();
			y=Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		P1.setX(x);
		P1.setY(y);
		
		System.out.println(P1.distanza(P0));
		
	}

}


