import java.util.LinkedList;
import java.util.List;


public class Estoque {
	private List<Ferramenta>ferramenta = new LinkedList<Ferramenta>();
	
	
	public void cadastrarFerramenta(Ferramenta ferramenta) {
		ferramenta.add(ferramenta);
		
	}
	
	public List <Ferramenta>buscarFerramentaPorEspecificacao(Especificacao espec){
		List<Ferramenta> ferramentaEncontradas = new LinkedList<Ferramenta>();
		for(Ferramenta ferramenta:ferramenta) {
			if(ferramenta.getEspec().comparar(espec)) ferramentaEncontradas.add(ferramenta);
		}
		return ferramentaEncontradas;
	}
	
	public Ferramenta buscarFerramentaPorNumeroDeCadastro(String codigodecadastro) {
		for(Ferramenta ferramenta:ferramenta) {
			if(ferramenta.getCodigoDeCadastro().equals(codigodecadastro)) return ferramenta;
		}
		return null;
	}
	
	public List<Ferramenta> getFerramenta(){
		return ferramenta;
	}
}

