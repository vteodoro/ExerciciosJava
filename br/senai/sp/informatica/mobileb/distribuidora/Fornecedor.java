package br.senai.sp.informatica.mobileb.distribuidora;

public class Fornecedor {
	
	private String nome;
	private int id;
	private String endereco;
	
	public Fornecedor(String nome, int id, String endereco) {
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
