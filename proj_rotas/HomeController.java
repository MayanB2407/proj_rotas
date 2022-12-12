package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {
	@GetMapping("/")

	public String index() {

		return "index";

	}

	@GetMapping("/signin")
	public String login() {

		return "signin";
	}
	
	@PostMapping("/process_login")
	public String process_login(HttpServletRequest request,Model model) {
		String Usuario = request.getParameter("Usuario");
		String Senha = request.getParameter("Senha");
		
		System.out.println("Usuario:" +Usuario);
		System.out.println("Senha:" + Senha);
		
		if(Senha.equals ("12345678")) {
			model.addAttribute("nome", Usuario);
			model.addAttribute("descricao", "Viajar");
			return "dashboard";
		}
		
		else {
			model.addAttribute("mensagem", "Senha inválida");
			return "erro";
	}
}
	

	@PostMapping("/dashboard")
	public String dashboard(HttpServletRequest request,Model model) {

			return "dashboard";
			
		}
	

	@GetMapping("/signup")
	public String cadastro() {

		return "signup";
	}
	@GetMapping("/quemsou")
	public String Quemsou() {

		return "quemsou";
	}
	@GetMapping("/cadastrado")
	public String cadastrado() {

		return "cadastrado";
	}

	@GetMapping("/cadastro_livro")
	public String cadastro_livro() {

		return "cadastro_livro";

	}
}