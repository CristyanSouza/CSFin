package br.com.cristyan.CSFin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cristyan.CSFin.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

	
}
