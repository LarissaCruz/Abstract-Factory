package app;

import java.sql.Date;

import fabricas.FabricaHTML;
import fabricas.FabricaLatex;
import fabricas.FabricaMarkdown;
import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;

public class Main {
	public static void main(String[] args) {
		FabricaDocumento fabrica = new FabricaHTML();
		
		Cabecalho cabecalhoHTML =  fabrica.criarCabecalho();
		Corpo corpoHTML = fabrica.criarCorpo();
		Rodape rodapeHTML = fabrica.criarRodape();
		
		cabecalhoHTML.setTitulo("Documento HTM");
		cabecalhoHTML.setEmpresa("EMP1");
		corpoHTML.setTexto("Digite o que está pensando");
		rodapeHTML.setData(new Date(0));
		
		
		Documento HTML=fabrica.criarDocumento(cabecalhoHTML,corpoHTML, rodapeHTML );
		
		System.out.println(HTML.getDocumento());
		System.out.println("\n ------------------------------------------------------\n");
		
		FabricaDocumento fabricaMarkdown = new FabricaMarkdown();
		
		Cabecalho cabecalhoMarkdown =  fabricaMarkdown.criarCabecalho();
		Corpo corpoMarkdown = fabricaMarkdown.criarCorpo();
		Rodape rodapeMarkdown = fabricaMarkdown.criarRodape();
		
		cabecalhoMarkdown.setTitulo("Documento Markdown");
		cabecalhoMarkdown.setEmpresa("EMP1");
		corpoMarkdown.setTexto("Digite o que está pensando");
		rodapeMarkdown.setData(new Date(0));
		
		
		Documento Markdown = fabricaMarkdown.criarDocumento(cabecalhoMarkdown,corpoMarkdown, rodapeMarkdown );
		
		System.out.println(Markdown.getDocumento());
		
		System.out.println("\n ------------------------------------------------------\n");
		
		FabricaDocumento fabricaLatex = new FabricaLatex();
		
		Cabecalho cabecalhoLatex =  fabricaMarkdown.criarCabecalho();
		Corpo corpoLatex = fabricaMarkdown.criarCorpo();
		Rodape rodapeLatex = fabricaMarkdown.criarRodape();
		
		cabecalhoLatex.setTitulo("Documento Markdown");
		cabecalhoLatex.setEmpresa("EMP1");
		corpoLatex.setTexto("Digite o que está pensando");
		rodapeLatex.setData(new Date(0));
		
		
		Documento Latex = fabricaLatex.criarDocumento(cabecalhoLatex,corpoLatex, rodapeLatex );
		
		System.out.println(Latex.getDocumento());
		
		
		
	}
}
