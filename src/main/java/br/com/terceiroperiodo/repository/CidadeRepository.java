package br.com.terceiroperiodo.repository;


import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
   // List<Cidade> findByNomeAndAtivo(String nome, Boolean status);
}
