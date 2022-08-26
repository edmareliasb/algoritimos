package br.com.ordenacao.algoritmo;

import br.com.ordenacao.model.Produto;

public class TesteMenorPreco {

	public static void main(String[] args) {
		
		Produto[] produtos = {
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Bras�lia", 16000),
				new Produto("Smart", 46000)
		};
		
		int maisBarato = buscaMenor(produtos);
		
		int maisCaro = buscaMaior(produtos);
		
		System.out.println(maisBarato);
		System.out.println("Carro mais barato " + produtos[maisBarato].getNome());
		
		System.out.println(maisCaro);
		System.out.println("Carro mais caro " + produtos[maisCaro].getNome());
	}

	private static int buscaMaior(Produto[] produtos) {
		
		int maisCaro = 0;
		
		for (int atual = 0; atual <= produtos.length -1; atual++) {			
			if (produtos[atual].getPreco() > produtos[maisCaro].getPreco()) {
				maisCaro = atual;
			}
		}
		
		return maisCaro;
	}

	private static int buscaMenor(Produto[] produtos) {
		int maisBarato = 0;
		
		for (int atual = 0; atual <= produtos.length -1; atual++) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}