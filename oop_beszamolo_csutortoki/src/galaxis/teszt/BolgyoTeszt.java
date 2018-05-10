package galaxis.teszt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import galaxis.Bolygo;

public class BolgyoTeszt {
	
	public static void main(String[] args) {
		
		Bolygo tomb[] = new Bolygo[8];
		
		tomb[0] = new Bolygo("Merkur", (float)0.24, 4878);
		tomb[1] = new Bolygo("Venus", (float)0.62, 12104);
		tomb[2] = new Bolygo("Fold", (float)1, 12756);
		tomb[3] = new Bolygo("Mars", (float)1.88, 6794);
		tomb[4] = new Bolygo("Jupiter", (float)11.86, 142800);
		tomb[5] = new Bolygo("Saturn", (float)29.46, 120000);
		tomb[6] = new Bolygo("Uranus", (float)84.01, 50800);
		tomb[7] = new Bolygo("Neptune", (float)164.79, 48600);
		
		////////////////////////////////
		
		int legkisebb_index = atmero(tomb);// 2
		System.out.println("Legkisebb bolygo:\n"+tomb[legkisebb_index].toString());
		
		int counter = keringesKisebb(tomb);// 3
		System.out.println("Keringesi ido: "+counter);
		
		
		
		
		//////////////////////////////// 4. feladat
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 2; i < 5; i++) {
			int foldi_tomeg = 0;
			
			try {
				System.out.print("\n"+(i+1)+"Foldi tomeg: ");
				foldi_tomeg = Integer.parseInt(input.readLine());
				
			} catch (IOException kivetel){
				System.out.println("HIBA A BEVITELBEN!\n\tURJA:");
				i--;
				
			}
			
			System.out.println(tomb[i].atszamit(foldi_tomeg));
			
		}
		
		////////////////////////////////  5. feladat
		
		System.out.println("\n");
		
		for(Bolygo x : tomb) {
			System.out.println(x.toString());
		}
		
	}
	
	public static int keringesKisebb(Bolygo tomb[]) { //3. feladat
		float fold_keringes = tomb[2].getKeringesi_ido();
		
		int counter = 0;
		
		for(Bolygo x : tomb) {
			if(x.getKeringesi_ido() < fold_keringes)
				counter++;
		}
		
		return counter;
	}
	
	public static int atmero(Bolygo tomb[]) { //2. feladat
		int legkisebb_index = 0;
		
		for (int i = 1; i < tomb.length; i++) {
			if(tomb[legkisebb_index].getAtmero() > tomb[i].getAtmero())
				legkisebb_index = i;
		}
		
		return legkisebb_index;
	}

}
