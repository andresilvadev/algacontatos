package com.algaworks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosController {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Jon Snow", "55 4563 9966"));
		LISTA_CONTATOS.add(new Contato("2", "Arya Stark", "55 4563 8855"));
		LISTA_CONTATOS.add(new Contato("3", "Sansa Stark", "55 4563 7744"));
		LISTA_CONTATOS.add(new Contato("4", "Brandon Stark", "55 4563 6633"));
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public String listagem() {
		return "listar";
	}
	
	@GetMapping("/contatos/novo")
	public String criarContato() {
		return "cadastroContato";
	}
}
