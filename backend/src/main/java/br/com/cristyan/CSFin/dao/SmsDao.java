package br.com.cristyan.CSFin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import br.com.cristyan.CSFin.model.Sale;
import br.com.cristyan.CSFin.repository.SaleRepository;



@Service
public class SmsDao {

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;
	
	@Autowired
	SaleRepository saleRepository;
	
	public void sendSms(Long id) {
		
		Sale sale = saleRepository.findById(id).get();
		
		
		String msg = String.format("O vendedor %s foi destaque com uma venda de R$ %.2f ", sale.getSellerName(),sale.getAmount());

		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, msg).create();

		System.out.println(message.getSid());
	}
}
