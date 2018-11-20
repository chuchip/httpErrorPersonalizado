package com.profesorp;

public class MiBean {
	private int codigo;
	private String valor;
	
	public MiBean()
	{
		
	}
	
	public MiBean(int codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
