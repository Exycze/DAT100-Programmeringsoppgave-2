package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {
        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    // b)
    public static String tilStreng(int[] tabell) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // c)
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        boolean finnes = false;
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                finnes = true;
                break;
            }
        }
        return finnes;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {
        int[] reversed = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reversed[i] = tabell[tabell.length - 1 - i];
        }
        return reversed;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] result = new int[tabell1.length + tabell2.length];

        // Kopier elementene fra tabell1
        for (int i = 0; i < tabell1.length; i++) {
            result[i] = tabell1[i];
        }

        // Kopier elementene fra tabell2
        for (int i = 0; i < tabell2.length; i++) {
            result[tabell1.length + i] = tabell2[i];
        }
        return result;
    }
}
