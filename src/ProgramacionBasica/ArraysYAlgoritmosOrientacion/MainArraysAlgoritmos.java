package ProgramacionBasica.ArraysYAlgoritmosOrientacion;

public class MainArraysAlgoritmos {
    public static void main(String[] args) {
        int[] numeros = {1, 7, 9, 3, 4, 30, 20, 55, 86, 75};

        ordenarPorInsercion(numeros);
        System.out.print("Orden del array por Insercion: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        ordenarPorBurbuja(numeros);
        System.out.print("Orden del array por burbuja: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void ordenarPorInsercion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = actual;
        }
    }

    public static void ordenarPorBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}