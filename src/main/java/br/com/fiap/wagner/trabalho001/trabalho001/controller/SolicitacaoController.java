package br.com.fiap.wagner.trabalho001.trabalho001.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.fiap.wagner.trabalho001.trabalho001.dto.Solicitacao;
import br.com.fiap.wagner.trabalho001.trabalho001.service.impl.SolicitacaoServiceImpl;

@Controller
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoServiceImpl service;
	
	@GetMapping("/abrir_solicitacao")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("abrir_solicitacao");
		view.addObject(new Solicitacao());
		return view;
	}
	
	@PostMapping("/salvar_solicitacao")
	public ModelAndView SalvarSolicitacao(@Valid Solicitacao solicitacao, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute(solicitacao);
			return new ModelAndView("abrir_solicitacao");
		}
		service.salvarSolicitacao(solicitacao);
		
		ModelAndView view = new ModelAndView("salvar_solicitacao");

		return view;
	}
	
	
	/*@PostMapping("/ti_service/ti_confirmacao")
	public ModelAndView ti_confirmacao(Solicitacao solicitacao) {
		repository.save(solicitacao);
		ModelAndView view = new ModelAndView("ti_service/ti_confirmacao");

		return view;
	}*/
	
	/*@PostMapping("salvar-produto")
	public String salvarProduto(@Valid Produto produto, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(produto);
			return "produto";
		}
		service.salvarProduto(produto);
		return "redirect:/";
	}*/

}
