/*
 * DivisaoInteiraReal.java
6 - Crie um arquivo chamado DivisaoInteiraReal.java. Complete o código, substituindo a seqüência
xxxxx com operações de divisão, operações de casting e parênteses. O programa deve exibir os
números 2, 2.5, 2.5, 2.5 e 2.0 nessa ordem. A cada linha complete o código de uma forma diferente.
Não é necessário completar todas as seqüências.
* Marco Vinicius dos Santos de Paula
 */


public class DivisaoInteiraReal {
	
	public static void main (String[] args) {
		int a = 5;
		int b = 2;
		System.out.println(a/b);//2
		System.out.println((double)a/b);//2.5
		System.out.println(a/(double)b);//2.5
		System.out.println((double)a/(double)b);//2.5
		System.out.println((double)(a/b));//2.0
	}
}
