package br.com.ordenacao.algoritmo;

import br.com.ordenacao.model.Nota;

public class MergeSort {

    public static void main(String[] args) {
        Nota[] notas = {
                new Nota("Jonas", 3),
                new Nota("Mariana", 5),
                new Nota("Andre", 4),
                new Nota("Carlos", 8.5),
                new Nota("Paulo", 9),
                new Nota("Juliana", 6.7),
                new Nota("Ana", 10),
                new Nota("Lucia", 9.3),
                new Nota("Guilherme", 7)
        };

        ordena(notas, 0, notas.length);

        for(int atual = 0; atual < notas.length; atual++) {
            Nota nota = notas[atual];
            System.out.println(nota.getNome() + " " + nota.getValor());
        }
    }

    private static void ordena(Nota[] notas, int inicio, int termino) {

        int quantidade = termino - inicio;
        if(quantidade > 1) {
            int meio = (inicio + termino) / 2;
            ordena(notas, inicio, meio);
            ordena(notas, meio, termino);
            intercala(notas, inicio, meio, termino);
        }
    }

    private static void intercala(Nota[] notas, int inicio, int meio, int termino) {

        Nota[] resultado = new Nota[termino - inicio];
        int atual = 0;
        int atual1= inicio;
        int atual2 = meio;
        while (atual1 < meio &&
                atual2 < termino) {

            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if (nota1.getValor() < nota2.getValor()) {
                resultado[atual] = nota1;
                atual1 ++;
            } else {
                resultado[atual] = nota2;
                atual2 ++;
            }
            atual ++;
        }

        while (atual1 < meio) {
            resultado[atual] = notas[atual1];
            atual1 ++;
            atual ++;
        }

        while (atual2 < termino) {
            resultado[atual] = notas[atual2];
            atual2 ++;
            atual ++;
        }

        for (int i = 0; i < atual; i++) {
            notas[inicio + i] = resultado[i];
        }
    }
}
