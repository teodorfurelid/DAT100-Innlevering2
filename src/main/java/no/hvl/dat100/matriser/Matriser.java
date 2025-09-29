package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int i = 0; i < matrise.length; i++){
            for (int k = 0; k < matrise[i].length; k++){
                System.out.print(matrise[i][k] + " ");
            }
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

        String verdi = "";
        for (int i = 0; i < matrise.length; i++) {
            for (int k = 0; k < matrise[i].length; k++) {
                verdi += matrise[i][k] + " ";
            }
            if (i < matrise.length - 1){
                verdi += "\n";
            }
        }
        verdi += "\n";
        return verdi;
    }

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] sum = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++){
            for (int k = 0; k < matrise[i].length; k++){
                sum[i][k] += matrise[i][k]*tall;
            }
        }
        return sum;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int[][] c = new int[a.length][b.length];
        boolean test = true;

        for (int i = 0; i < c.length-1; i++){
            if (a[i] != b[i]){
                 test = false;
            } else {

            }
        }
		return test;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speil = new int[matrise.length][matrise[0].length];
        int t = 0;
        int f = 0;
        for (int i = speil.length-1; i >= 0; i--){
            for (int k = speil[i].length-1; k >= 0; k--){
                speil[i][k] = matrise[k][i];
                f++;
                if (f >= speil.length) {
                    f = 0;
                }
            }
            t++;
        }


        return speil;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
