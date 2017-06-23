package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class HimmelMove {

	Timer himmelMove;
	int temp = 80;
	
	public HimmelMove() {
		himmelMove = new Timer();
		himmelMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {	
				if(Variablen.himmelX < - 800){
					Variablen.himmelX = 801;
				}
				else{
					Variablen.himmelX -= 8;
				}
				
				if(Variablen.himmelX2 < - 800){
					Variablen.himmelX2 = 801;
				}
				else{
					Variablen.himmelX2 -= 8;
				}		
		}}, 0, temp);
	}
}