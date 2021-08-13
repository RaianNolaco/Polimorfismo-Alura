
public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; //0 = Fimcionario comun. 1 = Gerente, 2 = diretor
	
	public double getBonificacao(){
		
		if(this.tipo == 2) {
			
			return this.salario + 1000;
			
		}else if(this.tipo == 1){
			
			return this.salario;
			
		}else{
			
			return this.salario * 0.1;
		}
	}
	
	//tipo
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
