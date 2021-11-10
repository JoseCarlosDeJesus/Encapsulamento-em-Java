package br.com.pc2.semana6;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		/*
		 * CaixaAgencia ca = new CaixaAgencia(); GerenteOperacional go = new
		 * GerenteOperacional();
		 */
		
		Divida d = new Divida(123,900.50,LocalDate.of(2020, 12, 23));
		
		System.out.println(d);
		
		System.out.println("Valor bruto: "+d.getValor());
		
		d.setValor(d.getValor()*0.9);
		
		System.out.println("Valor com desconto: "+d.getValor());
		

	}

}
