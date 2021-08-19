
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Raian");
		String nome = g1.getNome();
		
		
		System.out.println(nome);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		Funcionario f1 = new Funcionario();
		EditorVideo ev1 =  new EditorVideo();
		
		g1.setSalario(5000);
		f1.setSalario(2000);
		ev1.setSalario(2500);
		
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev1);

		System.out.println(controle.getSoma());

		
	}
	

}
