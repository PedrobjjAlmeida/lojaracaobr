package model;

/**
 * Escapsulamento dos dados (fluxo)
 * 
 * @author Pedro Noga
 *
 */

public class JavaBeans {
	// variaveis encapsuladas usadas no fluxo
	private String idpro;
	private String nomeproduto;
	private String tipo;
	private String quantidade;
	private String valor;

	/**
	 * idpro
	 * 
	 * @return idpro
	 */
	public String getIdpro() {
		return idpro;
	}

	/**
	 * idpro
	 * 
	 * @param idpro
	 */
	public void setIdpro(String idpro) {
		this.idpro = idpro;
	}

	/**
	 * nomeproduto
	 * 
	 * @return nomeproduto
	 */
	public String getNomeproduto() {
		return nomeproduto;
	}

	/**
	 * nomeproduto
	 * 
	 * @param nomeproduto
	 */
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	/**
	 * tipo
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * tipo
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * quantidade
	 * 
	 * @return quantidade
	 */
	public String getQuantidade() {
		return quantidade;
	}

	/**
	 * quantidade
	 * 
	 * @param quantidade
	 */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * valor
	 * 
	 * @return valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * valor
	 * 
	 * @param valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * construtor padrao
	 */
	public JavaBeans() {
		super();
	}

	/**
	 * construtor usado no array list
	 * 
	 * @param idpro
	 * @param nomeproduto
	 * @param tipo
	 * @param quantidade
	 * @param valor
	 */
	public JavaBeans(String idpro, String nomeproduto, String tipo, String quantidade, String valor) {
		super();
		this.idpro = idpro;
		this.nomeproduto = nomeproduto;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}
