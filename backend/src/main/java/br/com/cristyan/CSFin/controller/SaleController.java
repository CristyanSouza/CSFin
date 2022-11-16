package br.com.cristyan.CSFin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cristyan.CSFin.dao.SaleDao;
import br.com.cristyan.CSFin.model.Sale;

@RestController
@RequestMapping(value = "/sale")
public class SaleController {
	
	@Autowired
	private SaleDao saleDao;
	
	@GetMapping
	public List<Sale> findSales(){
		return saleDao.findSales();
	}
	
}
