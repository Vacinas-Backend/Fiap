package com.br.fiap.vacinas.controller;


import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;





public class Configuracao {
	private static CachingConnectionFactory connectionFactory;
	public static CachingConnectionFactory getConnection() {
		
		
		if(connectionFactory == null) {
			connectionFactory = new CachingConnectionFactory("jackal.rmq.cloudamqp.com");
			connectionFactory.setUsername("ajfmpvgk");
			connectionFactory.setPassword("YTCl5BT-PUuVOMb3UwZnTP45M3Y86wBm");
			connectionFactory.setVirtualHost("ajfmpvgk");
			
			
			connectionFactory.setRequestedHeartBeat(30);
			connectionFactory.setConnectionTimeout(30000);
			
		}
    	return connectionFactory;


		
	}

	
}
