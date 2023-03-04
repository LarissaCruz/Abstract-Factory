package interfaces;

public interface FabricaDocumento {
	Cabecalho criarCabecalho();
	Corpo criarCorpo();
	Rodape criarRodape();
	Documento criarDocumento(Cabecalho cabecalho, Corpo corpo, Rodape rodape);
}
