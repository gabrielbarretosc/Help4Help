package br.ucsal.h4h.model;

public class Doacao {

	private Integer id;
	private String dataDoacao;
	private String quantidade;
	
	private Usuario usuario;
	private Instituicao instituicao;
	private String tipoDoacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataDoacao() {
		return dataDoacao;
	}
	public void setDataDoacao(String dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	
	public String getTipoDoacao() {
		return tipoDoacao;
	}
	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}	
	
}
