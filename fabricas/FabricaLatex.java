package fabricas;

import abstractfactory.Latex;
import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;

public class FabricaLatex  implements FabricaDocumento {

	@Override
	public Cabecalho criarCabecalho() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Corpo criarCorpo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rodape criarRodape() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Documento criarDocumento(Cabecalho cabecalho, Corpo corpo, Rodape rodape) {
		// TODO Auto-generated method stub
		return new Latex( cabecalho,  corpo,  rodape);
	}

}
