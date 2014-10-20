package br.unisa.redeneural.calc;
/**
 * Class para mapear os neuronios especialista
 * 
 * @author zyon.silva
 *
 */
public class NeuronioEspecilista {

	// Pessos que cada neurio vai ter para fazer o calculo
	private int pesoUm;
	private int pesoDois;
	private int pesoTres;
	private int pesoQuatro;

	// Letra que o neuronio especialista representa
	private String letra;

	/**
	 * @return int
	 */
	public int getPesoUm() {
		return pesoUm;
	}

	/**
	 * @param pesoUm
	 */
	public void setPesoUm(int pesoUm) {
		this.pesoUm = pesoUm;
	}

	/**
	 * @return int
	 */
	public int getPesoDois() {
		return pesoDois;
	}

	/**
	 * @param pesoDois
	 */
	public void setPesoDois(int pesoDois) {
		this.pesoDois = pesoDois;
	}

	/**
	 * @return int
	 */
	public int getPesoTres() {
		return pesoTres;
	}

	/**
	 * @param pesoTres
	 */
	public void setPesoTres(int pesoTres) {
		this.pesoTres = pesoTres;
	}

	/**
	 * @return int
	 */
	public int getPesoQuatro() {
		return pesoQuatro;
	}

	/**
	 * @param pesoQuatro
	 */
	public void setPesoQuatro(int pesoQuatro) {
		this.pesoQuatro = pesoQuatro;
	}

	/**
	 * @return String
	 */
	public String getLetra() {
		return letra;
	}

	/**
	 * @param letra
	 */
	public void setLetra(String letra) {
		this.letra = letra;
	}

}
