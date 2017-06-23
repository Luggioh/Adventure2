package Punkt;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	
	Timer move;
	
		public Movement() {
			move = new Timer();
			move.scheduleAtFixedRate(new TimerTask(){
				
				public void run() {
					if(Variablen.punktX > 710){
						Variablen.punktX = 710;   //rechte Seite
						System.out.println("stop");
						}
					
					if(Variablen.punktX < -28){
						Variablen.punktX = -28;		//linke Seite
						System.out.println("stop");
						}
					
					if(Variablen.punktY > 470){
						Variablen.punktY = 470;			//unten
						System.out.println("stop");
						}
					
					if(Variablen.punktY < -10){
						Variablen.punktY = -10;			//oben
						System.out.println("stop");
						}
			}}, 0, 10);
	}

}