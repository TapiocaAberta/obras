package com.sjcdigital.model.entities.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sjcdigital.model.entities.DefaultEntity;

@Entity
public class Obra extends DefaultEntity {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "cidade_fk", nullable = false)
	private Cidade cidade;
	
	private String exercicio;
	private String semestre;
	private String funcaoDeGoverno;
	private String orgaoContratante;
	
	@Column(length = 500)
	private String destinacaoObra;
	
	@Column(length = 500)
	private String enderecoObra;
	
	private String pPA;
	private String lDO;
	private String atendimentoPopulacao;
	private String valorInicialPrevisto;
	private String valorTotalContratado;
	private String nomeEmpresaContratada;
	private String dataInicioObra;
	private String valorTotalTermosAditivos;
	private String reajuste;
	private String nivelExecuçãoFisica;
	private String valorTotalPago;
	private String dataPrevistaConclusao;
	private String situacaoObra;
	private String dataRecebimentoDefinitivo;
	private String nomeServidorResponsavel;
	
	private Integer obraUtil = 0;
	private Integer obraInutil = 0;

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getFuncaoDeGoverno() {
		return funcaoDeGoverno;
	}

	public void setFuncaoDeGoverno(String funcaoDeGoverno) {
		this.funcaoDeGoverno = funcaoDeGoverno;
	}

	public String getOrgaoContratante() {
		return orgaoContratante;
	}

	public void setOrgaoContratante(String orgaoContratante) {
		this.orgaoContratante = orgaoContratante;
	}

	public String getDestinacaoObra() {
		return destinacaoObra;
	}

	public void setDestinacaoObra(String destinacaoObra) {
		this.destinacaoObra = destinacaoObra;
	}

	public String getEnderecoObra() {
		return enderecoObra;
	}

	public void setEnderecoObra(String enderecoObra) {
		this.enderecoObra = enderecoObra;
	}

	public String getpPA() {
		return pPA;
	}

	public void setpPA(String pPA) {
		this.pPA = pPA;
	}

	public String getlDO() {
		return lDO;
	}

	public void setlDO(String lDO) {
		this.lDO = lDO;
	}

	public String getAtendimentoPopulacao() {
		return atendimentoPopulacao;
	}

	public void setAtendimentoPopulacao(String atendimentoPopulacao) {
		this.atendimentoPopulacao = atendimentoPopulacao;
	}

	public String getValorInicialPrevisto() {
		return valorInicialPrevisto;
	}

	public void setValorInicialPrevisto(String valorInicialPrevisto) {
		this.valorInicialPrevisto = valorInicialPrevisto;
	}

	public String getValorTotalContratado() {
		return valorTotalContratado;
	}

	public void setValorTotalContratado(String valorTotalContratado) {
		this.valorTotalContratado = valorTotalContratado;
	}

	public String getNomeEmpresaContratada() {
		return nomeEmpresaContratada;
	}

	public void setNomeEmpresaContratada(String nomeEmpresaContratada) {
		this.nomeEmpresaContratada = nomeEmpresaContratada;
	}

	public String getDataInicioObra() {
		return dataInicioObra;
	}

	public void setDataInicioObra(String dataInicioObra) {
		this.dataInicioObra = dataInicioObra;
	}

	public String getValorTotalTermosAditivos() {
		return valorTotalTermosAditivos;
	}

	public void setValorTotalTermosAditivos(String valorTotalTermosAditivos) {
		this.valorTotalTermosAditivos = valorTotalTermosAditivos;
	}

	public String getReajuste() {
		return reajuste;
	}

	public void setReajuste(String reajuste) {
		this.reajuste = reajuste;
	}

	public String getNivelExecuçãoFisica() {
		return nivelExecuçãoFisica;
	}

	public void setNivelExecuçãoFisica(String nivelExecuçãoFisica) {
		this.nivelExecuçãoFisica = nivelExecuçãoFisica;
	}

	public String getValorTotalPago() {
		return valorTotalPago;
	}

	public void setValorTotalPago(String valorTotalPago) {
		this.valorTotalPago = valorTotalPago;
	}

	public String getDataPrevistaConclusao() {
		return dataPrevistaConclusao;
	}

	public void setDataPrevistaConclusao(String dataPrevistaConclusao) {
		this.dataPrevistaConclusao = dataPrevistaConclusao;
	}

	public String getSituacaoObra() {
		return situacaoObra;
	}

	public void setSituacaoObra(String situacaoObra) {
		this.situacaoObra = situacaoObra;
	}

	public String getDataRecebimentoDefinitivo() {
		return dataRecebimentoDefinitivo;
	}

	public void setDataRecebimentoDefinitivo(String dataRecebimentoDefinitivo) {
		this.dataRecebimentoDefinitivo = dataRecebimentoDefinitivo;
	}

	public String getNomeServidorResponsavel() {
		return nomeServidorResponsavel;
	}

	public void setNomeServidorResponsavel(String nomeServidorResponsavel) {
		this.nomeServidorResponsavel = nomeServidorResponsavel;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Integer getObraUtil() {
		return obraUtil;
	}

	public void setObraUtil(Integer obraUtil) {
		this.obraUtil = obraUtil;
	}

	public Integer getObraInutil() {
		return obraInutil;
	}

	public void setObraInutil(Integer obraInutil) {
		this.obraInutil = obraInutil;
	}

}
