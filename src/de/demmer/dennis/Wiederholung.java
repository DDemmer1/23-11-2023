package de.demmer.dennis;


// ALT + SHIFT + R -> überall namen ändern
public class Wiederholung {
	
	public static void main(String[] args) {
	
		
		//-- while --
		
		//Läufervariable
		int i = 0;
	
			//Abbruchbedingung
		while(i < 10) {

			System.out.println("Läuervariable - while - schleife: " + i);
			
			//hochzählen der Läuervariable
			i = i + 1;
		}
		
		
		
		//-- for Schleife --
		      //Läufervariable    //Abbruchbedingung    //hochzählen der Läuervariable
		for(  int j = 5        ;     j < 10          ;                j++            ) {
			
			
			//hier wird alles wiederholt
			System.out.println("Läuervariable - for - schleife: " + j);
			
			
		}
		
		
	// do - while
		
	int x = 0;
	do {
		System.out.println("test");
		x++;
	} while(x < 10);
		

		

		
		
	}

}
