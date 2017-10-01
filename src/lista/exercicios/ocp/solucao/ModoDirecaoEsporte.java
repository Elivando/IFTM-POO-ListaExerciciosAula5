package lista.exercicios.ocp.solucao;

public class ModoDirecaoEsporte implements ModosDeDirecao {
	private Veiculo veiculo;

	@Override
	public Veiculo modoDirecao() {
		this.veiculo = new Veiculo(500, 10);
		return this.veiculo;
	}

}