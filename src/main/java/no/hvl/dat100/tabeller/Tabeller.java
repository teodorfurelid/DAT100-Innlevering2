package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int k = 0; k<tabell.length; k++) {
            System.out.print(tabell[k] + " ");
        }

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tekst = "";
        String sum = "";
        int k = 0;

        for (k = 0; k<tabell.length; k++) {

            tekst = String.valueOf(tabell[k]);

            if (k < tabell.length-1) {
                tekst = tekst + ",";
            }

            sum += tekst;
        }

        return ("[" + sum +  "]");
        //Her mangler eg måte å få inn komma (,) mellom dei dei tr e talla??
    }

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

        for (int r = 0; r<tabell.length; r++) {
            sum += tabell[r];
        }

        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        boolean sanning = false;

        for (int r = 0; r < tabell.length; r++) {
            if (tall == tabell[r]) {
                sanning = true;
            }
        }

        return sanning;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int giUt = -1;

        for (int r = 0; r<tabell.length; r++) {
            if (tall == tabell[r]) {
                return r;
            }
        }
        return giUt;

	}

	// f)
	public static int[] reverser(int[] tabell) {

        int[] reverser = new int[tabell.length];
        int k = 0;

        for (int r = tabell.length-1; r >= 0; r--) {
            reverser[r] = tabell[k];

            k++;
        }
        return reverser;
    }

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sorter = true;
        int k = 0;

        while (sorter && k < tabell.length-1) {
            if (tabell[k] > tabell[k+1]){
                sorter = false;
            }
            k++;
        }
        return sorter;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] tab = new int[tabell1.length+tabell2.length];


        for (int i = 0; i < tabell1.length; i++){
            tab[i] = tabell1[i];
        }

        int i = 0;
        for (int k = tabell1.length; k < tabell2.length + tabell1.length; k++) {

            tab[k] = tabell2[i];
            i++;
        }

        return tab;
	}
}
