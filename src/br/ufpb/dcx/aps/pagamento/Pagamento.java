package br.ufpb.dcx.aps.pagamento;

public class Pagamento {

	protected String pagamentoEfetuado;
	
	public String efetuarPagamento(String pagamento) {
		this.pagamentoEfetuado = pagamento;
		return pagamentoEfetuado;
	}

}
