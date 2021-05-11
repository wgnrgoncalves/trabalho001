package br.com.fiap.wagner.trabalho001.trabalho001.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.wagner.trabalho001.trabalho001.entity.SolicitacaoEntity;


@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {
	

}