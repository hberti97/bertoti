package ferramentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Henrique
 */
public class Ferramenta {
    private String CodigoDeCadastro;
    private Especificacao espec;
    
    public Ferramenta(String CodigoDeCadastro, Especificacao espec){
        this.CodigoDeCadastro = CodigoDeCadastro;
        this.espec = espec;
    }
    
    public String getCodigoDeCadastro(){
        return CodigoDeCadastro;
    }
    public void setCodigoDeCadastro(String novoCodigoDeCadastro){
        this.CodigoDeCadastro = novoCodigoDeCadastro;
    }
    public Especificacao getEspec(){
        return espec;
    }
    
    public void SetEspec(Especificacao espec){
        this.espec = espec;
    }

	public void add(Ferramenta ferramenta) {
		// TODO Auto-generated method stub
		
	}




	
}
