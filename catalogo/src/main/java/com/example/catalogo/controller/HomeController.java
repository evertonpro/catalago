package com.example.catalogo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.catalogo.model.Produto;
import com.example.catalogo.repository.Produtos;

@Controller
public class HomeController {
	@Autowired
	private Produtos produtos;

	@RequestMapping("/cadastroProduto/editarProduto/{id}")
	@ResponseBody
	public ResponseEntity<Optional<Produto>> buscarlista_id(@PathVariable Long id) {
		return ResponseEntity.ok(produtos.findById(id));
	}

	@RequestMapping("/produtos/{id}")
	@ResponseBody
	public ResponseEntity<Optional<Produto>> buscarProduto_id(@PathVariable Long id) {
		return ResponseEntity.ok(produtos.findById(id));
	}

	@RequestMapping("/produtos/{id}")
	@ResponseBody
	public Produto buscarcatalago_id(@PathVariable Long id) {
		return produtos.findById(id).get();
	}

	@RequestMapping("/produtos")
	@ResponseBody
	public Produto criarpreco() {
		return new Produto();
	}

	@RequestMapping("/produtos")
	@ResponseBody
	public Produto buscarProduto(@RequestBody Produto produto) {
		 if (59.99 > produto.getPreco{	 			
				 
		     produtos.save(produto);	         
		 }
		 
		    else

	    {
   	     return null;
	    }
   	     
	}

	@RequestMapping("/produtos/{id}")
	@ResponseBody
	public Produto buscarvalor(@PathVariable long id) {
		Produto produto = produtos.findById(id).get();
		return produtos.save(produto);

	}

	@RequestMapping("/produtos/{id}")
	@ResponseBody
	public void buscaritem(@PathVariable long id) {
		produtos.deleteById(id);
	}

	@RequestMapping("/produtos/search")
	@ResponseBody
	public List<Produto> buscarPreco() {
		return produtos.findAll();
	}

	@RequestMapping("/produtos/{id}")
	@ResponseBody
	public ResponseEntity<?> excluir_id(@PathVariable long id) {
		produtos.deleteById(id);

		if (produtos.findById(id) == null) {
			return ResponseEntity.ok(null);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
