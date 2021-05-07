package br.com.fiap.wagner.trabalho001.trabalho001.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.wagner.trabalho001.trabalho001.dto.Solicitacao;
import br.com.fiap.wagner.trabalho001.trabalho001.entity.SolicitacaoEntity;
import br.com.fiap.wagner.trabalho001.trabalho001.repository.SolicitacaoRepository;
import br.com.fiap.wagner.trabalho001.trabalho001.service.SolicitacaoService;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService {

	@Autowired
	private SolicitacaoRepository repository;
	@Override
	public List<Solicitacao> listaSolicitacoes() {
		// TODO Auto-generated method stub
		List<SolicitacaoEntity> lista= repository.findAll();
		List<Solicitacao> solicitacoes = fromTo(lista);
		return solicitacoes;
	}

	

	@Override
	public Solicitacao salvarSolicitacao(Solicitacao solicitacao) {
		SolicitacaoEntity entity = fromTo(solicitacao);
		entity = repository.save(entity);
		Solicitacao solicitacaoRetorno = fromTo(entity);
		return solicitacaoRetorno;
	}
	@Override
	public Solicitacao editarSolicitacao(Long id) {
		SolicitacaoEntity entity = repository.findById(id).get();
		return fromTo(entity);
	}

	@Override
	public void excluirSolicitacao(Long id) {

		repository.deleteById(id);
		
	}
	
	private List<Solicitacao> fromTo(List<SolicitacaoEntity> lista) {
		List<Solicitacao> listaDto = new ArrayList<>();
		for (SolicitacaoEntity solicitacaoEntity : lista) {
			Solicitacao dto = new Solicitacao();
			dto.setId(solicitacaoEntity.getId());
			dto.setGrupo(solicitacaoEntity.getGrupo());
			dto.setDescricao(solicitacaoEntity.getDescricao());
			dto.setNome(solicitacaoEntity.getNome());
			listaDto.add(dto);
		}
		return listaDto;

		
	}
	private SolicitacaoEntity fromTo(Solicitacao solicitacao) {
		SolicitacaoEntity entity = new SolicitacaoEntity();
		entity.setId(solicitacao.getId());
		entity.setGrupo(solicitacao.getGrupo());
		entity.setDescricao(solicitacao.getDescricao());
		entity.setNome(solicitacao.getNome());
		return entity;

	}
	
	private Solicitacao fromTo(SolicitacaoEntity entity) {
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setId(entity.getId());
		solicitacao.setGrupo(entity.getGrupo());
		solicitacao.setDescricao(entity.getDescricao());
		solicitacao.setNome(entity.getNome());
		return solicitacao;
		
	}

}
