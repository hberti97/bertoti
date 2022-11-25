package ferramentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Teste {

	@Test
	void test() {
			Estoque estoque = new Estoque ();
		
			assertEquals(estoque.getFerramenta().size(),0);
		
			estoque.cadastrarFerramenta(new Ferramenta("210009632", new Especificacao("Kennametal", "Fresa", "Metal Duro")));
					
			assertEquals(estoque.getFerramenta().size(),1);
			
			estoque.cadastrarFerramenta(new Ferramenta("210004466", new Especificacao("SECO", "Torno", "HSS")));
			estoque.cadastrarFerramenta(new Ferramenta("210009958", new Especificacao("Iscar", "Fresa", "Metal Pesado")));
			
			assertEquals(estoque.getFerramenta().size(),3);
			
	}

}
