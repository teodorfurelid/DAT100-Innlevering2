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

        // TODO
        throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
