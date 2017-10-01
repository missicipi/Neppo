package lista.exercicios.ocp.violation;


public class ManipuladorDeEventos {

	private ModoDirecaoPasseio passeio;
	private ModoDirecaoEsporte esporte;
    private Veiculo veiculo;

    public ManipuladorDeEventos(final Veiculo veiculo,ModoDirecaoPasseio passeio,ModoDirecaoEsporte esporte) {
        this.veiculo = veiculo;
        this.esporte = esporte;
        this.passeio = passeio;
    }}

  //  public void mudarModoDirecao(){
    	
      /*  switch (modoDirecao){
            case ESPORTE:
                veiculo.setPotencia(500);
                veiculo.setAlturaSuspencao(10);
                break;
            case PASSEIO:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspencao(20);
                break;
            default:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspencao(20);
                break;
            // para adicionar outro modo de direção, precisamos adicionar outro modo (exemplo ECONOMICO) duas classes serão alteradas ModoDirecao e ManipuladorDeEventos
        }*/
   

	

