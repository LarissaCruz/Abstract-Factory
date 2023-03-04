package fabricas;

import elementos.ConcretCabecalho;
import elementos.ConcretCorpo;
import elementos.ConcretRodape;
import elementos.HTML;
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

