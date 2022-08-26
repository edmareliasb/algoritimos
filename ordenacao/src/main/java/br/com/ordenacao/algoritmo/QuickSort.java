package br.com.ordenacao.algoritmo;

import br.com.ordenacao.model.Nota;

public class QuickSort {

    public static void main(String[] args) {

        /*Nota[] notas = {
                new Nota("andre", 4),
                new Nota("carlos", 8.5),
                new Nota("ana", 10),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("lucia", 9.3),
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("Guilherme", 7)

        };*/

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

    private static void ordena(Nota[] notas, int de, int ate) {
        int elementos = ate - de;
        if (elementos > 1) {
            int posicaoDoPivo = particiona(notas, de, ate);
            ordena(notas, de, posicaoDoPivo);
            ordena(notas, posicaoDoPivo + 1, ate);
        }
    }

    private static int particiona(Nota[] notas, int inicio, int termino) {
        int menoresAteAgora = inicio;
        int pivo = termino - 1;
        Nota notaPivo = notas[pivo];

        for(int analisando = inicio; analisando < pivo; analisando ++) {
            Nota atual = notas[analisando];

            if(atual.getValor() <= notaPivo.getValor()) {
                troca(notas, analisando, menoresAteAgora);
                menoresAteAgora++;
            }
        }

        troca(notas, pivo, menoresAteAgora);
        return menoresAteAgora;
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];
        notas[para] = nota1;
        notas[de] = nota2;
    }
}
