package ferramentas;

public class Especificacao {
	private String marca;
	private String tipo;
	private String material;
	
	public Especificacao(String marca, String tipo, String material) {
		this.marca = marca;
		this.tipo = tipo;
		this.material = material;
	}
    
	public String getMarca() {
		return marca;
	}
    public void setMarca(String novaMarca) {
    	this.marca = novaMarca;
    }
    public String getTipo() {
		return tipo;
	}
    public void setTipo(String novaTipo) {
    	this.tipo = novaTipo;
    }
    public String getMaterial() {
		return material;
	}
    public void setMaterial(String novaMaterial) {
    	this.material = novaMaterial;
    }
    public boolean comparar(Especificacao especificacao) {
    	if(this.marca.equals(especificacao.marca)&& this.tipo.equals(especificacao.tipo)&& this.material.equals(especificacao.material)) {
    		return true;
    	}else{
    		return false;
    	}
    }


}

