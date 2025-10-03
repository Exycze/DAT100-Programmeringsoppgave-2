package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
            }
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();

        for (int[] rad : matrise) {
            for (int i = 0; i < rad.length; i++) {
                sb.append(rad[i]);
                if (i < rad.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append(" \n");
        }
        return sb.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][];

        int radIndex = 0;
        for (int[] rad : matrise) {
            nyMatrise[radIndex] = new int[rad.length];

            int kolonneIndex = 0;
            for (int verdi : rad) {
                nyMatrise[radIndex][kolonneIndex] = verdi * tall;
                kolonneIndex++;
            }
            radIndex++;
        }
        return nyMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        int[][] speile = new int[matrise.length][matrise.length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                speile[i][j] = matrise[i][matrise.length - 1 - j];
            }
        }
        return speile;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int aRad = a.length;
        int aKolonne = a[0].length;
        int bRad = b.length;
        int bKolonne = b[0].length;

        if (aKolonne != bRad) {
            throw new IllegalArgumentException("Antall kolonner i A må være lik antall rader i B.");
        }
        int[][] result = new int[aRad][bKolonne];

        for (int i = 0; i < aRad; i++) {
            for (int j = 0; j < bKolonne; j++) {
                for (int k = 0; k < aKolonne; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
