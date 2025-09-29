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

        for (int i = speil.length-1; i >= 0; i--){
            for (int k = speil[i].length-1; k >= 0; k--){
                speil[i][k] = matrise[k][i];

            }
        }


        return speil;
	
	}

	// f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;

        int[][] resultat = new int[m][p];

        if (n == b.length) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        resultat[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return resultat;
    }

}
