package com.br.fiap.vacinas.controller;

import com.br.fiap.vacinas.model.Vacinas;




public class MensageriaQueue{
	
	RabbitAdmin admin = new RabbitAdmin(Configuracao.get.Conection());
	Queue emailconcluido = new Queue ("Mensagem concluida");
	
	admin.declareQueue(emailconcluido);
	
	FanoutExchange exchange = new FanoutExchange("exchange.automacao");
	admin.declareExchange(exchange);
	
	admin.declareBinding(BindingBuilder.bind(emailconcluido).to(exchange));
	
	RabbitTemplate template = new RabbitTemplate(Configuracao.get.Conection());
	
	template.convertAndsend("exchange.automaca", "vacinas", "Concluido");
}