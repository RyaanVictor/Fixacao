package br.com.dominio;

public class Chamado {
	private Long idChamado; 
	private String solicitacao; 
	private String depSolicitado; 
	private String descChamado; 
	private String dataAbertura; 
	private String dataResolucao; 
	private String statusChamado; 
	private String observacoes; 
	private String atendente; 
	public Chamado() {}
	
	
	public Chamado(Long idchamado, String solicitacao, String departamentosolicitado, String descricaochamado, 
			String dataabertura, 
			 String dataresolucao, String statuschamado, String observacoes, String 
			atendente) { 
			 this.idChamado = idchamado; 
			 this.solicitacao = solicitacao; 
			 this.depSolicitado = departamentosolicitado; 
			 this.descChamado = descricaochamado; 
			 this.dataAbertura = dataabertura; 
			 this.dataResolucao = dataresolucao; 
			 this.statusChamado = statuschamado; 
			 this.observacoes = observacoes; 
			 this.atendente = atendente; 
			 }


	public Long getIdChamado() {
		return idChamado;
	}


	public void setIdChamado(Long idchamado) {
		this.idChamado = idchamado;
	}


	public String getSolicitacao() {
		return solicitacao;
	}


	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}


	public String getDepSolicitado() {
		return depSolicitado;
	}


	public void setDepSolicitado(String departamentosolicitado) {
		this.depSolicitado = departamentosolicitado;
	}


	public String getDescChamado() {
		return descChamado;
	}


	public void setDescChamado(String descricaochamado) {
		this.descChamado = descricaochamado;
	}


	public String getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(String dataabertura) {
		this.dataAbertura = dataabertura;
	}


	public String getDataResolucao() {
		return dataResolucao;
	}


	public void setDataResolucao(String dataresolucao) {
		this.dataResolucao = dataresolucao;
	}


	public String getStatusChamado() {
		return statusChamado;
	}


	public void setStatusChamado(String statuschamado) {
		this.statusChamado = statuschamado;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public String getAtendente() {
		return atendente;
	}


	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
}


