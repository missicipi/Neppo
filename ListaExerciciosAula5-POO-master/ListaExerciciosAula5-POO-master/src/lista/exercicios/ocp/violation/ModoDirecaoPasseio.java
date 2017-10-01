package lista.exercicios.ocp.violation;

public class ModoDirecaoPasseio implements ModosDeDirecao {
	
	private Veiculo veiculo;
	private String passeio;

	@Override
	public String modoDirecao(String tipo) {
		veiculo.setPotencia(400);
		veiculo.setAlturaSuspencao(20);
	
		;
		return passeio;
	}
	

}
