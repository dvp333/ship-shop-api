package br.com.dvp.tcc.shipshop.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dvp.tcc.shipshop.api.model.InfoGerencias;

@RestController
@RequestMapping("/informacoes")
public class InformacoesGerenciaisResource {

	@GetMapping
	@RequestMapping("")
	public InfoGerencias getInformacoes() {
		//Dados Fictícios
	    return new InfoGerencias(247.50, 38, 12, 59, 14);
	}
	
}
