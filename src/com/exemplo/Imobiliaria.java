package com.exemplo;

public class Imobiliaria extends Empresa {
	public String email;
	public String nomeContato;
	public Imovel apartamento;
	
	public Imobiliaria(){
		apartamento = new Imovel();
	}
}
