package br.ufpb.dcx.aps.pagamento;

public class PagamentoCartao extends Pagamento{

	int parcelas;
	
	public String efetuarPagamento(String pagamento, int parcelas) {
		super.efetuarPagamento(pagamento);
		this.parcelas = parcelas;
		return pagamentoEfetuado + " em "+ parcelas +" suaves prestações.";
	}
}
