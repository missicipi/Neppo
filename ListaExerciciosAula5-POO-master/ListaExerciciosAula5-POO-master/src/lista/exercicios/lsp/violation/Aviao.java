package lista.exercicios.lsp.violation;

public class Aviao extends Veiculo {

    // Um avi�o pode reverter o motor enquanto se movimenta para frente
	
	public void mudaMarcha(Marcha marcha){
		if (Marcha.R.equals(marcha)&& Marcha.D.equals(marcha)){
			System.out.println("O avi�o est� com os motores em reverso e andando para tr�s");
		if (Marcha.R.equals(marcha)){
			System.out.println ("O avi�o est� com os motores em modo linear e andando para frente ");
		}
		}
		
	}
}
