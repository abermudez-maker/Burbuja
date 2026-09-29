import java.util.Random;

public class Ejercicio2_Burbuja1000 {
    static final int TAMANO = 1000;

    static void imprimir(String titulo, int[] a) {
        System.out.println(titulo);
        for (int k = 0; k < a.length; k++) {
            System.out.printf("%5d", a[k]);
            if ((k + 1) % 10 == 0) System.out.println();
        }
        System.out.println();
    }

    static void burbuja(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {                 
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    huboIntercambio = true;
                }
            }
            if (!huboIntercambio) break;              
        }
    }

    public static void main(String[] args) {
        int[] arreglo = new int[TAMANO];
        Random rnd = new Random();

        for (int i = 0; i < TAMANO; i++) {
            arreglo[i] = rnd.nextInt(10000);
        }

        int[] original = arreglo.clone();

        burbuja(arreglo);

        imprimir("ARREGLO ORIGINAL (desordenado):", original);
        imprimir("ARREGLO ORDENADO (burbuja, ascendente):", arreglo);
    }
}
