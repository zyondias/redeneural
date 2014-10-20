package br.unisa.redeneural.calc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zyon.silva
 *
 */
@WebServlet("/calculaRedeNeural")
public class RedeNeural extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		NeurioDeEntrada neurioDeEntrada = pegarNeurioDeEntrada(request);
		List<NeuronioEspecilista> listaNeuronioEspecialista = getListaNeuronioEspecialista();

		NeuronioEspecilista neuronioEspecilistaIdentificado = CalculaConexaoNeural
				.pegaNeurioEspecialistaCorreto(listaNeuronioEspecialista,
						neurioDeEntrada);

		out.println("Você formou uma letra: "
				+ neuronioEspecilistaIdentificado.getLetra());
	}

	private static NeurioDeEntrada pegarNeurioDeEntrada(
			HttpServletRequest request) {
		NeurioDeEntrada neurioDeEntrada = new NeurioDeEntrada();
		if (request.getParameter("entradaQuatro") != null) {
			neurioDeEntrada.setEntradaUm(Integer.parseInt(request
					.getParameter("entradaQuatro")));
		}
		if (request.getParameter("entradaTres") != null) {
			neurioDeEntrada.setEntradaDois(Integer.parseInt(request
					.getParameter("entradaTres")));
		}
		if (request.getParameter("entradaDois") != null) {
			neurioDeEntrada.setEntradaTres(Integer.parseInt(request
					.getParameter("entradaDois")));
		}
		if (request.getParameter("entradaUm") != null) {
			neurioDeEntrada.setEntradaQuatro(Integer.parseInt(request
					.getParameter("entradaUm")));
		}
		return neurioDeEntrada;

	}

	private static List<NeuronioEspecilista> getListaNeuronioEspecialista() {
		// carregando lista de neurio especialista
		NeuronioEspecilista neurioEspecilistaEmL = new NeuronioEspecilista();
		NeuronioEspecilista neurioEspecilistaEmI = new NeuronioEspecilista();

		neurioEspecilistaEmL.setLetra("L");
		neurioEspecilistaEmL.setPesoUm(0);
		neurioEspecilistaEmL.setPesoDois(0);
		neurioEspecilistaEmL.setPesoTres(0);
		neurioEspecilistaEmL.setPesoQuatro(1);

		neurioEspecilistaEmI.setLetra("I");
		neurioEspecilistaEmI.setPesoUm(1);
		neurioEspecilistaEmI.setPesoDois(0);
		neurioEspecilistaEmI.setPesoTres(1);
		neurioEspecilistaEmI.setPesoQuatro(-2);
		List<NeuronioEspecilista> lista = new ArrayList<NeuronioEspecilista>();
		lista.add(neurioEspecilistaEmI);
		lista.add(neurioEspecilistaEmL);

		return lista;
	}
}
