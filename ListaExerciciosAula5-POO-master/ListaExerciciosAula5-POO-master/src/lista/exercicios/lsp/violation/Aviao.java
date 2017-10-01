package lista.exercicios.lsp.violation;

public class Aviao extends Veiculo {

    // Um avião pode reverter o motor enquanto se movimenta para frente
	
	public void mudaMarcha(Marcha marcha){
		if (Marcha.R.equals(marcha)&& Marcha.D.equals(marcha)){
			System.out.println("O avião está com os motores em reverso e andando para trás");
		if (Marcha.R.equals(marcha)){
			System.out.println ("O avião está com os motores em modo linear e andando para frente ");
		}
		}
		
	}
}
