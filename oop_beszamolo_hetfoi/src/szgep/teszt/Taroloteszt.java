package szgep.teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) {
		Merevlemez tomb[] = new Merevlemez[2];
		
		//java.util.Scanner input = new java.util.Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < tomb.length; i++) {
			String marka = null;
			double kapacitas = 0, foglalt_terulet = 0;
			
			try {
				
				System.out.print("Tipus: ");
					marka = input.readLine();
			
				System.out.print("Kapacitas(GB): ");
					kapacitas = Double.parseDouble(input.readLine());
			
				System.out.print("Foglalt terulet (GB): ");
					foglalt_terulet = Double.parseDouble(input.readLine());
					
			} catch (IOException kivetel) {
				
				kivetel.printStackTrace();
				i--;
				
			}
				
				
			tomb[i] = new Merevlemez(marka, kapacitas, foglalt_terulet);
			
			
		}
		
		//input.close();
		
		System.out.println("Legnagyobb kapacitasu: "+legnagyobbKapacitasu(tomb));
		System.out.println("Szabad terulet nagyobb, mint a foglalt terulet (db): "+szabadteruletNagyobbMint(tomb));
		
		for(Merevlemez x : tomb) {
			System.out.println(x.toString());
		}
		
		Arrays.sort(tomb);
		
		for(Merevlemez x : tomb) {
			System.out.println(x.toString());
		}
	}
	
	public static String legnagyobbKapacitasu(Merevlemez tomb[]) {
		
		int max_index = 0;
		
		for (int i = 1; i < tomb.length; i++) {
		
			if(tomb[i].getKapacitas() > tomb[max_index].getKapacitas())
				max_index = i;
			
		}
		
		return tomb[max_index].toString();
	}
	
	public static int szabadteruletNagyobbMint(Merevlemez tomb[]) {
		int counter = 0;
		
		for (int i = 0; i < tomb.length; i++) {
		
			if(tomb[i].getSzabadHely() > tomb[i].getFoglalt_terulet())
				counter++;
			
		}
		
		return counter;
	}
	
}
