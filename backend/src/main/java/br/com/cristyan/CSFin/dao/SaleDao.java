package br.com.cristyan.CSFin.dao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.cristyan.CSFin.model.Sale;
import br.com.cristyan.CSFin.repository.SaleRepository;


@Service
public class SaleDao {
	
	@Autowired
	SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable){
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = minDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return saleRepository.findSales(min, max, pageable);
	}
}
