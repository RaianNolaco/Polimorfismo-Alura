
//gerente � um funcionario, gerente herda da classe funcionario
public class Gerente extends Funcionario {

	private int senha;

	public Gerente() {

	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {

		if (this.senha == senha) {

			return true;

		} else
			return false;

	}
	
	 
	
	public double getBonificacao(){
		System.out.println("Chamando bonifica��o do Gerente");
		return super.getBonificacao() + super.getSalario();
	}
	   
	 
}
