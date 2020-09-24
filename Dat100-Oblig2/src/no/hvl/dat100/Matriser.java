package no.hvl.dat100;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {

				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}

	}

	

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				matrise[i][j] *= 8;
			}
		}
		return matrise;
	}

	// d)
	public static void erLik(int a, int b) {
		
		
	}

	
		
	// e)
	public static int[][] speile(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				matrise[i][j] = matrise[j][i];
			}
		}

		return matrise;

	}
	
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] *= a[i][j];
			}
		}

		return b;
	}

	}
