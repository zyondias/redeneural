package br.unisa.redeneural.calc;

import java.util.List;

/**
 * 
 * Class responsavel para fazer o calculo da conexao neural
 * 
 * @author zyon.silva
 *
 */
public class CalculaConexaoNeural {

	/**
	 * Metodo faz os calculos com os pesos de cada neurorio especialista
	 * existente para pegar somente aquele que retorna acima de zero que vai ser
	 * o correto
	 * 
	 * @param neuroniosEspecilistas
	 * @param neurioDeEntrada
	 * @return {@link NeuronioEspecilista} compativel com neuroio de entrada
	 *         informado
	 */
	public static NeuronioEspecilista pegaNeurioEspecialistaCorreto(
			List<NeuronioEspecilista> neuroniosEspecilistas,
			NeurioDeEntrada neurioDeEntrada) {

		NeuronioEspecilista neurioCorreto = null;
		int qtdDeNueriosQueCalculoDaMaiorQueZero = 0;
		for (NeuronioEspecilista neuronioEspecilista : neuroniosEspecilistas) {
			if (calculaFormula(neurioDeEntrada, neuronioEspecilista) > 0) {
				neurioCorreto = neuronioEspecilista;
				qtdDeNueriosQueCalculoDaMaiorQueZero++;
			}
		}
		// verifica se somente um neurio especilista ta correto
		if (qtdDeNueriosQueCalculoDaMaiorQueZero == 1) {
			return neurioCorreto;
		}

		return null;
	}

	private static int calculaFormula(NeurioDeEntrada neurioDeEntrada,
			NeuronioEspecilista neuronioEspecilista) {
		int endtrada1 = neurioDeEntrada.getEntradaUm();
		int entrada2 = neurioDeEntrada.getEntradaDois();
		int entrada3 = neurioDeEntrada.getEntradaTres();
		int entrada4 = neurioDeEntrada.getEntradaQuatro();

		int peso1 = neuronioEspecilista.getPesoUm();
		int peso2 = neuronioEspecilista.getPesoDois();
		int peso3 = neuronioEspecilista.getPesoTres();
		int peso4 = neuronioEspecilista.getPesoQuatro();

		int resultado = (endtrada1 * peso1) + (entrada2 * peso2)
				+ (entrada3 * peso3) + (entrada4 * peso4);

		return resultado;
	}
}
