package no.hvl.dat100;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for(int i= 0; i<tabell.length; i++) {
			System.out.print(tabell[i] + " ");
			}
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum=0;
		for(int i =0; i<tabell.length;i++) {
			sum+=tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet= false;
		int pos= 0;
		while(!funnet&& pos< tabell.length) {
			if(tall== tabell[pos]) {
				funnet= true;
				}
			pos++;
			}
		return funnet;
		}


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		boolean funnetTall=false;
		int i=0;
		do {
			if(tabell[i]==tall) {
				funnetTall=true;
			}
			i++;
		}while(i<tabell.length&&funnetTall==false);
		if(funnetTall==false) {
			i=-1;
		}
	return i;
	

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tab = new int[tabell.length];
		int fraTop= tabell.length-1; //begynner på den høyeste veriden til arrayet
		for (int i=0; i<tabell.length; i++) {
			tab [i]= tabell[fraTop];
			fraTop--; //trekker fra ein etter kvar runde, motsatt av i++
		}
		 return tab;
		}
		
		
	

	// g)
	public static boolean erSortert(int[] tabell) {

		int j= 0;
		boolean sortert= true;
		while(sortert && j< tabell.length-1) {
			if(tabell[j] > tabell[j+1]) {
				sortert= false;
				}
			j++;
			}
		return sortert;
		}
	


	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i=0; i<tabell1.length; i++) {
			nyTab[i]= tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length +j] = tabell2[j];
		}
			 
		return nyTab;
			 
	
	
}
	}