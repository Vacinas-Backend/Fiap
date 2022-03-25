package com.br.fiap.vacinas.controller;



import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;




public class Mensageria {
	public static  String queuevacinas(String email){
		
		RabbitAdmin admin = new RabbitAdmin(Configuracao.getConnection());
		
		Queue queueemailconcluido = new Queue("Mensagem concluida");
		
		admin.declareQueue(queueemailconcluido);
		
		FanoutExchange exchange = new FanoutExchange("exchange.automacao");
		admin.declareExchange(exchange);
		
		admin.declareBinding(BindingBuilder.bind(queueemailconcluido).to(exchange));
		
		RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());
		
		template.convertAndSend("exchange.automacao", "vacinas", email);	
		
		
		return "Concluido";
		
	}
	
	
}
