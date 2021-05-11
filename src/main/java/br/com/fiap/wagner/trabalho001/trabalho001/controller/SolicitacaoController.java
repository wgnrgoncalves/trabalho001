package br.com.fiap.wagner.trabalho001.trabalho001.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.fiap.wagner.trabalho001.trabalho001.dto.Solicitacao;
import br.com.fiap.wagner.trabalho001.trabalho001.service.impl.SolicitacaoServiceImpl;

@Controller
public class SolicitacaoController implements WebMvcConfigurer {
	
	@Autowired
	SolicitacaoServiceImpl service;
	
	
	@GetMapping("/abrir_solicitacao")
	public String home(Solicitacao solicitacao) {
		return "abrir_solicitacao";
	}
	
	@PostMapping("/salvar_solicitacao")
	public String SalvarSolicitacao(@Valid Solicitacao solicitacao, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "abrir_solicitacao";
		}
		service.salvarSolicitacao(solicitacao);
		return "redirect:/";
	}
	
	@GetMapping("/solicitacao/{id}")
	public ModelAndView editarSolicitacao(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("abrir_solicitacao");
		Solicitacao solicitacao = service.editarSolicitacao(id);
		view.addObject(solicitacao);
		return view;
		
	}
	
	@GetMapping("/solicitacao/excluir/{id}")
	public String excluirSolicitacao(@PathVariable Long id) {
		service.excluirSolicitacao(id);
		return "redirect:/";
	}

}
