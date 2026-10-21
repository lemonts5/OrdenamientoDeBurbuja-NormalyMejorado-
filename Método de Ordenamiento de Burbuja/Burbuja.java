import java.util.Arrays;

public class Burbuja {

    // 1. Método de Ordenamiento de Burbuja Normal
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("--- Pasada " + (i + 1) + " (Normal) ---");
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio (Swap) usando variable auxiliar
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    // 2. Método de Ordenamiento de Burbuja Mejorado (Optimizado con bandera)
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            boolean huboCambio = false; // Se reinicia en cada pasada
            System.out.println("--- Pasada " + (i + 1) + " (Mejorado) ---");

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio (Swap)
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    huboCambio = true; // Registramos que hubo un movimiento
                }
            }

            // Si no hubo ningún intercambio, el arreglo ya está ordenado y detenemos el ciclo
            if (!huboCambio) {
                System.out.println("-> ¡El arreglo ya está ordenado! Deteniendo anticipadamente en la pasada " + (i + 1));
                break;
            }
        }
    }

    // Método Main con casos de prueba
    public static void main(String[] args) {
        System.out.println("=== PRUEBA 1: ARREGLO TOTALMENTE DESORDENADO (Burbuja Normal) ===");
        int[] arregloDesordenado = {34, 12, 5, 67, 23, 9};
        
        System.out.println("Antes:   " + Arrays.toString(arregloDesordenado));
        ordenamientoBurbuja(arregloDesordenado);
        System.out.println("Después: " + Arrays.toString(arregloDesordenado));
        
        System.out.println("\n------------------------------------------------------------\n");

        System.out.println("=== PRUEBA 2: ARREGLO PARCIALMENTE ORDENADO (Burbuja Mejorado) ===");
        int[] arregloParcial = {1, 2, 4, 3, 5};
        
        System.out.println("Antes:   " + Arrays.toString(arregloParcial));
        ordenamientoBurbujaMejorado(arregloParcial);
        System.out.println("Después: " + Arrays.toString(arregloParcial));
    }
}