package br.com.cristyan.CSFin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cristyan.CSFin.model.Sale;
import br.com.cristyan.CSFin.repository.SaleRepository;


@Service
public class SaleDao {
	
	@Autowired
	SaleRepository saleRepository;
	
	public List<Sale> findSales(){
		return saleRepository.findAll();
	}
}
