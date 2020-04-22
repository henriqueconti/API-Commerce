package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity(name = "CELULAR")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1915718221326207385L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gerar um id automaticamente
	private Long id;
	
	@NotNull @NotEmpty @Length(min=10)
	private String nome;
	
	@NotNull 
	private int quantidade;
	
	@NotNull 
	private BigDecimal valor;
	
	@ManyToOne
	private Marca marca;
	
	@NotNull
	private String memoria;
	
	public Produto() {
		
	}
	
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
