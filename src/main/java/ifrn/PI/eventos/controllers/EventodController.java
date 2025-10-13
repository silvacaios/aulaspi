package ifrn.PI.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.PI.eventos.models.Evento;

@Controller
public class EventodController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping(path = "/eventos", method = RequestMethod.POST)
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		return "evento-adicionado";
	}
}
