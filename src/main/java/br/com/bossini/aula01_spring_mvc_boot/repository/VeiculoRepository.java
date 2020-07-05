package br.com.bossini.aula01_spring_mvc_boot.repository;

import br.com.bossini.aula01_spring_mvc_boot.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
