package calculadora;

import java.util.Scanner;

import util.Calculadora;

public class calculadorajava {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println("digite um numero inteiro: ");
		calc.numero1 = sc.nextInt();
		System.out.println("digite um numero inteiro: ");
		calc.numero2 = sc.nextInt();
		System.out.println("digite um numero inteiro: ");
		calc.numero3 = sc.nextInt();
		
		System.out.println("adi��o com dois numeros = " + calc.adicao1());
		System.out.println("adi��o com tr�s numeros = " + calc.adicao2());
		System.out.println("subtra��o com dois numeros = " + calc.subtracao1());
		System.out.println("subtra��o com tr�s numeros = " + calc.subtracao2());
		System.out.println("multiplica��o com dois numeros = " + calc.multiplicacao1());
		System.out.println("multiplica��o com tr�s numeros = " + calc.multiplicacao2());
		System.out.println("divis�o com dois numeros = " + calc.divisao1());
		System.out.println("divis�o com tr�s numeros = " + calc.adicao2());
		
		sc.close();
		
		

	}

}
