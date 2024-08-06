import java.util.*;

public class Lotto {
	//Objektvariabel 
	int[] rekke = new int[7]; 

	//konstruktør 
	public Lotto() {
		trekkTall(); 
	}

	//Objektmetode 
	private void trekkTall() {
		for(int i=0;i<rekke.length;i++) {
			boolean likt;
			int tall;  
			do {
				int j = 0; 
				likt = false;
				tall = Min.trekkTall(1, 34); 
				while(!likt && j < i) {
					if(tall == rekke[j++]) {
						likt = true; 
					}
				}
			} while(likt);
			rekke[i] = tall;
		} 
		Arrays.sort(rekke); 
	}

	//to String metode 
	public String toString() {
		return Arrays.toString(rekke); 
	}

	//Sammenlign boolean 
	public boolean equals(Lotto annen) {
		return Arrays.equals(rekke,annen.rekke);
	}
}

