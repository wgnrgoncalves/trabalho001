package br.com.fiap.wagner.trabalho001.trabalho001.service;

import java.util.List;

import br.com.fiap.wagner.trabalho001.trabalho001.dto.Solicitacao;



public interface SolicitacaoService {
	
	List<Solicitacao>listaSolicitacoes();
	Solicitacao salvarSolicitacao(Solicitacao solicitacao);
	Solicitacao editarSolicitacao(Long id);
	void excluirSolicitacao(Long id);

}
