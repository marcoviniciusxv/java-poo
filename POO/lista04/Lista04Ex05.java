/*
 * Lista04Ex05.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 5) [POO-018] Crie um programa que imprima na tela todos os números primos de 1 até 1000. Para tanto, 
	crie um método que receba um número inteiro como parâmetro de entrada e verifique se este número é 
	primo ou não retornando um boolean como resposta.
	Saída:
	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 
	127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 
	241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373
	379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499 503 
	509 521 523 541 547 557 563 569 571 577 587 593 599 601 607 613 617 619 631 641 643 647 
	653 659 661 673 677 683 691 701 709 719 727 733 739 743 751 757 761 769 773 787 797 809 
	811 821 823 827 829 839 853 857 859 863 877 881 883 887 907 911 919 929 937 941 947 953 
	967 971 977 983 991 997

 */

import java.util.Scanner;
public class Lista04Ex05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador, numeroDigitado;
		
		System.out.print( "Digite um numero: ");
		numeroDigitado = leia.nextInt();
		System.out.println();
		System.out.println( numeroPrimo( numeroDigitado ) );
		
		if( numeroPrimo( numeroDigitado ) ){
			System.out.println( "O numero digitado \"" + numeroDigitado + "\" EH um numero primo" );
		}else{
			System.out.println( "O numero digitado \"" + numeroDigitado + "\" NAO eh um numero primo" );
		}
		System.out.println();
		for( int numero = 1 ; numero <= 1000 ; numero ++ ){
			contador = 0;
			for( int primo = numero ; primo > 0 ; primo -- ){
				if( numero % primo == 0 ){
					contador ++;
				}
			}
			if( contador == 2 ){
				System.out.print( numero + "\t" );
			}
		}
	}
	static boolean numeroPrimo( int numeroDigitado ){
		int contador;
		boolean validade = false;
		for( int numero = 1 ; numero <= 1000 ; numero ++ ){
			contador = 0;
			for( int primo = numero ; primo > 0 ; primo -- ){
				if( numero % primo == 0 ){
					contador++;
				}
			}
			if( contador == 2 ){
				if( numero == numeroDigitado){
					validade = true;
					break;
				}
			}
		}
		return validade;
	}
}

