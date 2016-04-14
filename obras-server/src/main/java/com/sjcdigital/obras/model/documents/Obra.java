package com.sjcdigital.obras.model.documents;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Obra {

	private Integer exercicio;
	private Integer semestre;
	private String funcaoDeGoverno;
	private String orgaoContratante;
	private String destinacaoObra;
	private String enderecoObra;
	private String pPA;
	private String lDO;
	private String atendimentoPopulacao;
	private BigDecimal valorInicialPrevisto;
	private BigDecimal valorTotalContratado;
	private String nomeEmpresaContratada;
	private LocalDate dataInicioObra;
	private BigDecimal valorTotalTermosAditivos;
	private BigDecimal reajuste;
	private BigDecimal nivelExecuçãoFisica;
	private BigDecimal valorTotalPago;
	private LocalDate dataPrevistaConclusao;
	private String situacaoObra;
	private LocalDate dataRecebimentoDefinitivo;
	private String nomeServidorResponsavel;
	private String observacoes;

	public Integer getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = new Integer(exercicio);
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = new Integer(semestre);
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

	public BigDecimal getValorInicialPrevisto() {
		return valorInicialPrevisto;
	}

	public void setValorInicialPrevisto(BigDecimal valorInicialPrevisto) {
		this.valorInicialPrevisto = valorInicialPrevisto;
	}

	public BigDecimal getValorTotalContratado() {
		return valorTotalContratado;
	}

	public void setValorTotalContratado(BigDecimal valorTotalContratado) {
		this.valorTotalContratado = valorTotalContratado;
	}

	public String getNomeEmpresaContratada() {
		return nomeEmpresaContratada;
	}

	public void setNomeEmpresaContratada(String nomeEmpresaContratada) {
		this.nomeEmpresaContratada = nomeEmpresaContratada;
	}

	public LocalDate getDataInicioObra() {
		return dataInicioObra;
	}

	public void setDataInicioObra(LocalDate dataInicioObra) {
		this.dataInicioObra = dataInicioObra;
	}

	public BigDecimal getValorTotalTermosAditivos() {
		return valorTotalTermosAditivos;
	}

	public void setValorTotalTermosAditivos(BigDecimal valorTotalTermosAditivos) {
		this.valorTotalTermosAditivos = valorTotalTermosAditivos;
	}

	public BigDecimal getReajuste() {
		return reajuste;
	}

	public void setReajuste(BigDecimal reajuste) {
		this.reajuste = reajuste;
	}

	public BigDecimal getNivelExecuçãoFisica() {
		return nivelExecuçãoFisica;
	}

	public void setNivelExecuçãoFisica(BigDecimal nivelExecuçãoFisica) {
		this.nivelExecuçãoFisica = nivelExecuçãoFisica;
	}

	public BigDecimal getValorTotalPago() {
		return valorTotalPago;
	}

	public void setValorTotalPago(BigDecimal valorTotalPago) {
		this.valorTotalPago = valorTotalPago;
	}

	public LocalDate getDataPrevistaConclusao() {
		return dataPrevistaConclusao;
	}

	public void setDataPrevistaConclusao(LocalDate dataPrevistaConclusao) {
		this.dataPrevistaConclusao = dataPrevistaConclusao;
	}

	public String getSituacaoObra() {
		return situacaoObra;
	}

	public void setSituacaoObra(String situacaoObra) {
		this.situacaoObra = situacaoObra;
	}

	public LocalDate getDataRecebimentoDefinitivo() {
		return dataRecebimentoDefinitivo;
	}

	public void setDataRecebimentoDefinitivo(LocalDate dataRecebimentoDefinitivo) {
		this.dataRecebimentoDefinitivo = dataRecebimentoDefinitivo;
	}

	public String getNomeServidorResponsavel() {
		return nomeServidorResponsavel;
	}

	public void setNomeServidorResponsavel(String nomeServidorResponsavel) {
		this.nomeServidorResponsavel = nomeServidorResponsavel;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
