package com.mindtree.jmsspring.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TransReceiver 
{
	 @JmsListener(destination = "TransactionQueue")
	   public void receiveMessage(String transaction) {
	      System.out.println(transaction);
	      System.out.println(" received ");
	   }
}
