
import java.util.Arrays;

public class Ejercicio1_Burbuja {

    static void imprimir(int[] a) {
        StringBuilder val = new StringBuilder("Valores : ");
        for (int k = 0; k < a.length; k++) {
            val.append(String.format("%3d", a[k]));

        }
        System.out.println(val);
    }

    public static void main(String[] args) {
        int[] arreglo = {8, 5, 3, 1, 2};
        int n = arreglo.length;
        int comparaciones = 0, intercambios = 0;

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("---------------------------------------------");

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pasada " + (i + 1) + " (posición " + i + " con los demás)");
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[i] > arreglo[j]) {         
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    intercambios++;
                    System.out.println("  Compara " + arreglo[j] + " con " + arreglo[i]
                            + " -> se cambian: " + Arrays.toString(arreglo));
                } else {
                    System.out.println("  Compara " + arreglo[i] + " con " + arreglo[j]
                            + " -> no hay cambio: " + Arrays.toString(arreglo));
                }
            }
            System.out.println();
        }

        System.out.println("Arreglo ordenado (ascendente):");
        imprimir(arreglo);
        System.out.println("Comparaciones: " + comparaciones + " | Intercambios: " + intercambios);
    }
}
