
public class TesteFuncionario2 {

	public static void main(String[] args) {

		FuncionarioTeste f1 = new FuncionarioTeste();

		
		f1.setSalario(3100);

		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		
		f2.setSalario(5000);
		f2.setTipo(2);
		
		System.out.println(f2.getBonificacao());

	}

}
