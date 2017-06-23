package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Grasmove {

	Timer grasMove;
	int temp = 50;
	
	public Grasmove() {
		grasMove = new Timer();
		grasMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {	
				if(Variablen.wieseX1 < -400){
					Variablen.wieseX1 = 801;
				}
				else{
					Variablen.wieseX1 -= 8;
				}
				
				if(Variablen.wieseX2 < -400){
					Variablen.wieseX2 = 801;
				}
				else{
					Variablen.wieseX2 -= 8;
				}		
				
				if(Variablen.wieseX3 < -400){
					Variablen.wieseX3 = 801;
				}
				else{
					Variablen.wieseX3 -= 8;
				}
		}}, 0, temp);
	}
}