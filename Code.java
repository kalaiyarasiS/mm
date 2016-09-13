import java.util.*;
import java.lang.*;
import java.io.*;
 class Code {
		
	public static void main(String[] args) {
		int m[] = {10, 180, 10};
		System.out.println(isWallPossible(m));

		int m1[] = {10, 45, 10, -45, 10, 45};
		System.out.println(isWallPossible(m1));
		
		int m2[] = {10, 45, 10, -45, 10, 45, 10, -45};
		System.out.println(isWallPossible(m2));		
	}
	
	public static boolean isWallPossible(int[] moves) {		
		int treshold = 10000;
		int i = 0;
		Position p = new Position(0, MoveDirection.N); // start north
		boolean rotate = false;

		while (i < treshold) {
			rotate = false;
			for (int j = 0; j < moves.length; j++) {
				if (rotate) {
					p.addAngle(moves[j]);
				} else {
					p.addSteps(moves[j]);					
				}
				rotate = !rotate;
			}
			if (p.cycled && p.x == 0 && p.y == 0) {
			   return true;	
			}		
			i++;
		}		
		return false;
	}

}

class Position {
	int x;
	int y;
	
	int angle;
	MoveDirection d;
	boolean cycled;
	
	public Position(int angle, MoveDirection d) {
		super();
		x = y = 0;
		this.angle = angle;
		this.d = d;
		this.cycled = false; 
	}

	public void addSteps(int s) {
		if (d.equals(MoveDirection.N)) {
			y += s;
		} else if (d.equals(MoveDirection.E)) {
			x += s;
		} else if (d.equals(MoveDirection.S)) {
			y -= s;
		} else if (d.equals(MoveDirection.W)) {
			x -= s;
		}
	}

	public void addAngle(int a) {
		angle += a;
		if (angle >= 360) {
			angle = angle % 360;
			cycled = true;
		}
		if(angle >= 0 && angle < 90) {
			d = MoveDirection.N;
		}
		else if(angle >= 90 && angle < 180) {
			d = MoveDirection.E;
		}
		else if(angle >= 180 && angle < 270) {
			d = MoveDirection.S;
		}
		else if(angle >= 270 && angle < 360) {
			d = MoveDirection.W;
		} 
	}
}

enum MoveDirection {
	N,E,S,W;
}
