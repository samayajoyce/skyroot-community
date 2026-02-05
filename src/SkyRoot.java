//skyroot-community
public class SkyRoot{
	public static void main(String[] arg){
		String nomeFazendeiro = "samaya";
		char clima = 'E';//clima ensolarado
		double nivelSustentabilidade = 0.0;//começa ruim devido a poluicao e desmatamento
		int nivelDeAmizadeNpc = 0;
		boolean arvorePlantada = true;//a cada arvore plantada ganha bonus sustentavel e cortada 1 ponto
		int estaminaFazendeiro = 100;
		int habilidades = 0;//o jogodor tera avore de habilidade e melhorias que vai impactar na comunidade
		
		System.out.println("Bem vindo "+nomeFazendeiro);
		System.out.println("clima: "+clima);
		System.out.println("sutentatabilidade nivel: "+nivelSustentabilidade);
		System.out.println("Amizade com npc: "+nivelDeAmizadeNpc);
		System.out.println("Foi planta uma arvore hoje?: "+arvorePlantada);
		System.out.println("estamina apos cortar uma arvore"+(estaminaFazendeiro - 10));
		System.out.println("ao plantar uma arvore voce ganhou 1 ponto de habilidade:"+(habilidades+1));
		
		
	}
}
