package com.mindtree.jmsspring.sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.jmsspring.entity.Transaction;

@RestController
public class Transsender {
@Autowired
private JmsTemplate jmsTemplate;

@PostMapping("/send")
public void send(@RequestBody Transaction transaction)
{
	System.out.println("Sending transaction");
	jmsTemplate.convertAndSend("TransactionQueue",transaction.toString());
}
}
