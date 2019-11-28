package br.ufpb.dcx.aps.pagamento;

import java.text.SimpleDateFormat;

public class PagamentoBoleto extends Pagamento {

	SimpleDateFormat data;
	
	
	public String efetuarPagamento(String pagamento, SimpleDateFormat dataFormatada) {
		super.efetuarPagamento(pagamento);
		this.data = dataFormatada;
		return pagamentoEfetuado + " na data: " + this.data;
	}

}
