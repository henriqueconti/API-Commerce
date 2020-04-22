package com.produtos.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Marca;
import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.MarcaRepository;
import com.produtos.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
		
	@Autowired
	private MarcaRepository marcaRepository;
	
	@GetMapping
	public List<Produto> listaProduto(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto buscaProdutoId(@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@GetMapping("/marcas")
	public List<Marca> listaMarca(){
		return marcaRepository.findAll();
	}
	
	@PostMapping
	public Produto cadastrarProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto); 
	}	
	
	@DeleteMapping("/deletar/{id}")
	public void deletaProduto(@PathVariable(value="id") Long id) {
		produtoRepository.deleteById(id);
	}
	
	@PutMapping
	public Produto alteraroduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
