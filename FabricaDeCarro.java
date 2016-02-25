package Exercicios;

public class FabricaDeCarro  {
	
	private FabricaDeCarro(){
	
	}
	

	private static FabricaDeCarro instancia = null;
	
	public static FabricaDeCarro getInstancia(){
		if(instancia == null){
			System.out.println("Fabrica de carro criada...  ");
			instancia  = new FabricaDeCarro();
		}
	
		return instancia;
		
		
	}
	

	
}
