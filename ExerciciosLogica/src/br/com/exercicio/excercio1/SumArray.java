package br.com.exercicio.excercio1;

import java.util.HashMap;
import java.util.Map;

/**
 * Dando um array de numeros inteiros
 * Buscar o par de numeros cuja soma é igual a um valor passado como parametro.
 */
public class SumArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 5, 6, 9};
        int[] array2 = {1, 2, 4, 4};
        int[] array3 = {9, 3, 1, 5, 1, 6};
        int sum = 8;

        System.out.println(buscarComWhileArrayOrdenado(sum, array));
        System.out.println(buscarArrayDesordenado(sum, array3));
    }

    private static boolean buscarComWhileArrayOrdenado(int busca, int[] array) {
        int start = 0;
        int size = array.length -1;

        while (start < size) {
            int soma = array[start] + array[size];

            if (soma > busca) {
                size--;
                start = 0;
                continue;
            }
            if (soma == busca) {
                System.out.println(array[start] + " - " + array[size]);
                return true;
            }

            start ++;
        }
        return false;
    }

    private static boolean buscarArrayDesordenado(int busca, int[] array) {
        Map<Integer, Integer> numeroProcurado = new HashMap<>();

        for (int i = 0; i <= array.length; i++) {
            int numero = array[i];

            if (numeroProcurado.containsKey(numero)) {
                return true;
            } else {
                int dif = numero - busca;
                int difPositiva = (dif < 0) ? dif * -1 : dif;

                numeroProcurado.put(difPositiva, difPositiva);
            }
        }
        return false;
    }
}