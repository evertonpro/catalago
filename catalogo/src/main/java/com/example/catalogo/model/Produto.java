package com.example.catalogo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity  
public class Produto {
	
	    private Long id;
	    private String nome;
	    private String descricao;
	    private Double preco;
		public Long getId() {
			return id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		  

}