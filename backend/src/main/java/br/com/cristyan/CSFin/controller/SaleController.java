package br.com.cristyan.CSFin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cristyan.CSFin.dao.SaleDao;
import br.com.cristyan.CSFin.model.Sale;

@RestController
@RequestMapping(value = "/sale")
public class SaleController {
	
	@Autowired
	private SaleDao saleDao;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(name = "minDate", defaultValue = "")String minDate,
			@RequestParam(name = "maxDate", defaultValue = "")String maxDate,
			Pageable pageable){
		return saleDao.findSales(minDate, maxDate, pageable);
	}
	
}
