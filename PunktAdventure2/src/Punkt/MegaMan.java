package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class MegaMan {

	Timer mega;
	
	public MegaMan(){
		mega = new Timer();
		mega.scheduleAtFixedRate(new TimerTask(){
			
			public void run(){
				if(Variablen.megaX1 < Variablen.megaX2){
				Variablen.megaX1 += 20;
				Variablen.stand = false;
				}
				else{
					Variablen.megaX2 += 20;
					Variablen.stand = true;
				}
			}
		}, 0, 80);
	}
}
