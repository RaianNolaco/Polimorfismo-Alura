
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
	
		System.out.println("Chamando bonificação do Editor de video");
		return super.getBonificacao() + 300;
		
	} 
}
