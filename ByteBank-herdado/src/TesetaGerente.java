
public class TesetaGerente {

	public static void main(String[] args) {
		
		Gerente g1  =  new Gerente();
		
		g1.setNome("Raian");
		g1.setCpf("1234567");
		g1.setSalario(5000);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autentica = g1.autentica(2222);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
		
	}

}
