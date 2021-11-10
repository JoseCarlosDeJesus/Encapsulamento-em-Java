package br.com.pc2.semana6;

import java.time.LocalDate;

public class Divida {
	private Integer codigo;
	private Double valor;
	private LocalDate dataDeVencimento;

	public Divida(Integer codigo, Double valor, LocalDate dataDeVencimento) {
		this.codigo = codigo;
		this.valor = valor;
		this.dataDeVencimento = dataDeVencimento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(LocalDate dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	@Override
	public String toString() {
		return "Divida [codigo=" + codigo + ", valor=" + valor + ", dataDeVencimento=" + dataDeVencimento + "]";
	}

	/*
	 * public void ma() { Divida d = new Divida(); d.codigo = 90; d.valor = 890.50;
	 * LocalDate data = LocalDate.of(2020, 12, 23); d.dataDeVencimento = data; }
	 */

}
