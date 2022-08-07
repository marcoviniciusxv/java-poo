/*
 * Lista01Ex28.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 28) Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar
	as colunas da matriz de forma crescente e imprimir a matriz original e a matriz
	ordenada.
 * 
 */


public class Lista01Ex28 {
	
	public static void main (String[] args) {
		int m1[][] = new int[4][4];
		System.out.println("Matriz: \n");
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna ++){
				m1[linha][coluna] = (int)(Math.random()*20);
				System.out.print(m1[linha][coluna] + "\t");
			}
			System.out.println();
		}
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna ++){
				for(int linha2 = 0 ; linha2 < m1.length ; linha2 ++){
					for(int  coluna2 = 0 ; coluna2 < m1[linha2].length ; coluna2 ++){
						if(coluna == coluna2){
							if(m1[linha][coluna] < m1[linha2][coluna2]){
								int troca = m1[linha][coluna];
								m1[linha][coluna] = m1[linha2][coluna2];
								m1[linha2][coluna2] = troca;
							}
						}
					}
				}
			}
		}
		System.out.println("Matriz com as colunas ordenadas de maneira crescente: \n");
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna ++){
				System.out.print(m1[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}
}

