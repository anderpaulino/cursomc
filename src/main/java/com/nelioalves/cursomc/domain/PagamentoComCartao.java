package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@JsonTypeName("pagamentoComCartao")
@Entity
public class PagamentoComCartao extends Pagamento{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pedido);

		this.numeroDeParcelas = numeroParcelas;
	}


	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}


	public void setNumeroDeParcelas(Integer numeroParcelas) {
		this.numeroDeParcelas = numeroParcelas;
	}
	
	
	
	

}
