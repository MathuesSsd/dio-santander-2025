package ContaBanco.DesafioControleFluxo;

import java.util.Scanner;
import ContaBanco.DesafioControleFluxo.exception.ParametrosInvalidosException;;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		if (contagem <= 0) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 1; i <= contagem; i++){
			System.out.printf("Imprimindo o numero %s\n", i);
		}
	}
}