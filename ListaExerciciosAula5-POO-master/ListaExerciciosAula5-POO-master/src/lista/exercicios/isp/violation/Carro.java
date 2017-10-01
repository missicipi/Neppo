package lista.exercicios.isp.violation;

public class Carro extends Veiculo implements LigaDesligaRadio,LigaDesligaCamera {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
        radioOn = false;
	}

	@Override
	public void ligarCamera() {
		//nada pra fazer aqui
	}

	@Override
	public void desligarCamera() {
		// nada pra fazer aqui
	}
}