package fabricas;

import abstractfactory.ConcretCabecalho;
import abstractfactory.ConcretCorpo;
import abstractfactory.ConcretRodape;
import abstractfactory.HTML;
import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;

public class FabricaHTML implements FabricaDocumento{

	@Override
	public Cabecalho criarCabecalho() {
		// TODO Auto-generated method stub
		return new ConcretCabecalho();
	}

	@Override
	public Corpo criarCorpo() {
		// TODO Auto-generated method stub
		return new ConcretCorpo();
	}

	@Override
	public Rodape criarRodape() {
		// TODO Auto-generated method stub
		return new ConcretRodape();
	}

	@Override
	public Documento criarDocumento(Cabecalho cabecalho, Corpo corpo, Rodape rodape) {
		// TODO Auto-generated method stub
		return new HTML(cabecalho, corpo, rodape);
	}

}

