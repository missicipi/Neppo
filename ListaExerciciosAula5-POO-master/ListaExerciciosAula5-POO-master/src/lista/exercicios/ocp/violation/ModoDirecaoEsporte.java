package lista.exercicios.ocp.violation;

public class ModoDirecaoEsporte implements ModosDeDirecao {
	private Veiculo veiculo;
	private String esporte;

	@Override
	public String modoDirecao(String tipo) {
		veiculo.setPotencia(500);
		veiculo.setAlturaSuspencao(10);
		return esporte;
	}

}
