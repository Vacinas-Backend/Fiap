package com.br.fiap.vacinas.controller;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;



public static CachingConnectionFactory() {
    	
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