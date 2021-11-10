package br.com.pc2.semana6.pct1;

import java.time.LocalDate;

import br.com.pc2.semana6.pct2.PessoaJuridica;

public class PessoaFisica extends Cliente {
	private String cpf;
	protected String rg;
	public Character sexo;
	LocalDate dataDeNascimento;

	public String validarCpf() {
		return "CPF validado";
	}

	public void testarVisibilidade() { /*aqui temos o polimorfismo(sobrescrita) de método: a classe Cliente já possui esse método
mas aqui a implementamos de forma diferente,*/
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Cliente c = new Cliente();
	}

}
