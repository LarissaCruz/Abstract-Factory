package abstractfactory;

import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.Rodape;

public class Latex  implements Documento{
	Cabecalho cabecalho ;
	Corpo corpo;
	Rodape rodape;
	
	public Latex(Cabecalho cabecalho, Corpo corpo, Rodape Rodape) {
		this.cabecalho = cabecalho;
		this.corpo = corpo;
		this.rodape = Rodape;
	}

	@Override
	public String getDocumento() {
		// TODO Auto-generated method stub
		return "Meu documento latex";
	}

	@Override
	public String getCorpo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCabecalho() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRodape() {
		// TODO Auto-generated method stub
		return null;
	}

}
