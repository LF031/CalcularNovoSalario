import java.util.*;
public class ex1_2 {

	public static void main(String[] args) {
		// 1 - declarar variavel
		String nomeEmpregado;
		float salarioAtual;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		
		//2 Entrada de dados
		System.out.print("Digite o nome do empregado:");
		nomeEmpregado = leia.nextLine();
		System.out.print("Digite o salario atual:");
		salarioAtual = leia.nextFloat();
		System.out.print("Digite o novo salario:");
		novoSalario = leia.nextFloat();
		
		// 3  calculos
		novoSalario = salarioAtual + 15/100 * salarioAtual;
		
		 
		// 4 - saida de dados
		System.out.println("aumento" + novoSalario);
		
		
		
		
	
		

	}

}