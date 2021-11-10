package br.com.pc2.semana6.pct1;

import br.com.pc2.semana6.pct2.PessoaJuridica;

public class Cliente {
	public Integer codigo;
	private String nome;
	protected String endereco;
	String uf;
	private String cep;

	public String inserirCliente() {
		return "Ciente inserido";
	}

	public String atualizarCliente() {
		return "Ciente atualizado";
	}

	public void testarVisibilidade() {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Cliente c = new Cliente();
		
	}

}
