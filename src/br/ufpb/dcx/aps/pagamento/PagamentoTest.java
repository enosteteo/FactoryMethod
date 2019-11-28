package br.ufpb.dcx.aps.pagamento;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.jupiter.api.Test;

class PagamentoTest {

	@Test
	void testePagamentoAvista() {
		Pagamento pagamento = new Pagamento();
		String esperado = "Pagamento efetuado com sucesso.";
		assertEquals(esperado, pagamento.efetuarPagamento("Pagamento efetuado com sucesso."));		
	}
	
	@Test
	void testePagamentoBoleto() {
		PagamentoBoleto pagamento = new PagamentoBoleto();
		
		Date data = new Date();
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		dataFormatada.format(data);
		String esperado = "Boleto pago com sucesso na data: "+ dataFormatada;
		assertEquals(esperado, pagamento.efetuarPagamento("Boleto pago com sucesso", dataFormatada));
	}
	
	@Test
	void testePagamentoCartao() {
		PagamentoCartao pagamento = new PagamentoCartao();
		int prestacoes = 3;
		String esperado = "Parcelado com sucesso em 3 suaves prestações.";
		assertEquals(esperado, pagamento.efetuarPagamento("Parcelado com sucesso", prestacoes));
	}

}
