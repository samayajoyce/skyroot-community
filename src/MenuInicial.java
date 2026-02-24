//skyroot-community
import java.util.Scanner;
public class MenuIncial{
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== Bem-Vindo ao Skyroot===");
		System.out.println("Selecione a opção desejada:");
		System.out.println("1-Novo jogo\n2-Ver creditos\n3-Sair");
		int opcao = scan.nextInt();
		
		if(opcao == 1){
			System.out.println("inciando novo jogo");
			System.out.println("Selecione a classe desejada");
			System.out.println("(F)Fazendeiro - Foco em sustentabilidade:");
			System.out.println("(E)Engeinheiro - Foco em tecnologia:");
			char escolha = scan.next().toUpperCase().charAt(0);
			if(escolha == 'F'){
				System.out.println("Voce escolheu fazendeiro: USas plantas cresceram mais rapido");
			}else if(escolha == 'E'){
				System.out.println("Voce escolheu engeinehiro: suas maquinas gastarão menos energia");
			}else{
				System.out.println("opção invalida");
			}
		}else if(opcao == 2){
			System.out.println("created by Joyce");
		}else if(opcao == 3){
			System.out.println("saindo do jogo, ate a proxima");
		}else{
			System.out.println("opçao invalida");
		}
		
		
		
		
	}
}
