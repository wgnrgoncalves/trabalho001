package br.com.fiap.wagner.trabalho001.trabalho001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.wagner.trabalho001.trabalho001.dto.Solicitacao;
import br.com.fiap.wagner.trabalho001.trabalho001.service.impl.SolicitacaoServiceImpl;


@Controller
public class IndexController {
	
	@Autowired
	SolicitacaoServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		//Solicitacao solicitacao = service.editarSolicitacao(id);
		List<Solicitacao> solicitacoes = service.listaSolicitacoes();
		view.addObject("solicitacoes", solicitacoes);
		
		
		return view;
	}
	

}
