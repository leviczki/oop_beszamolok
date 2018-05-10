package bank_main;
import bank.CreditCard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsableCard {
	
	public static void main(String[] args) {
		
		CreditCard tomb[] = new CreditCard[5];

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		//beolvasas
		for (int i = 0; i < tomb.length; i++) {
			
			String tulajdonos = null;
			int egyenleg = 0;
			int hitelkeret = 0;
			
			try {
				
				System.out.print((i+1)+". Tulajdonos: ");
				tulajdonos = input.readLine();
			
				if(i > 1) {//0 es 1 a hitelkartya
					
					System.out.print("Egyenleg: ");
					egyenleg = Integer.parseInt(input.readLine());

				}
				
				System.out.print("Hitelkeret: ");
				hitelkeret = Integer.parseInt(input.readLine());
				
			} catch (IOException kivetel) {
				System.out.println("HIBA A BEVITELBEN!\n\n\tUJRA:\n");
				i--;
			}
			
			tomb[i] = new CreditCard(tulajdonos, egyenleg, hitelkeret);
			
		}
		
		//kp felvetel
		for(int i = 0; i < 3; i++) {
			
			int osszeg = 0;
			int index = (int) ( Math.floor( (Math.random()*5+1) ) );
			boolean siker = false;
			
			System.out.print( (index+1) + ": Irja be a felvenni kivant osszeget: ");
			
			do {
			
				try {
				
					osszeg = Integer.parseInt(input.readLine());
					siker = true;

				} catch (IOException kivetel) {
			
					System.out.println("HIBA A BEVITELBEN!\n\n\tUJRA:\n");
				
				}
			
			} while(!siker);
			
			siker = tomb[index].penzFelvetel(osszeg);
			
			if(siker)
				System.out.println("\tSIKERES PENZ FELVETEL!");
			else
				System.out.println("\tSIKERTELEN PENZ FELVETEL!");
			
		}
		
		//kiir
		for(CreditCard x : tomb)
			System.out.println(x.toString());
		
		//Legnagyobb egyenleggel rendelkezo tulajdonos
		System.out.println("Legnagyobb egyenleggel rendelkezo tulajdonos:"+kiAGazdag(tomb).getTulajdonos());
		
		//0 hitelkeret
		System.out.println("0 hitelkerettel rendelkezok szama (db): "+zeroHitelKeret(tomb));
		
		
	}
	
	public static CreditCard kiAGazdag(CreditCard tomb[]) {
		int gazdag_index = 0;
		
		for (int i = 1; i < tomb.length; i++) {
			if(tomb[gazdag_index].getEgyenleg() < tomb[i].getEgyenleg())
				gazdag_index = i;
		}
		
		return tomb[gazdag_index];
	}
	
	public static int zeroHitelKeret(CreditCard tomb[]) {
		int zeroHitelkeret_Counter = 0;
		
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i].getHitelkeret() == 0)
				zeroHitelkeret_Counter++;
		}
		
		return zeroHitelkeret_Counter;
	}
	
	
}
