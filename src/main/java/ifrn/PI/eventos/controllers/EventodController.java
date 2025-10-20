package ifrn.PI.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.PI.eventos.models.Evento;
import ifrn.PI.eventos.repositories.EventoRepository;

@Controller
public class EventodController {
	
	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}
	
	@RequestMapping(path = "/eventos", method = RequestMethod.POST)
	public String adicionar(Eventos evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "eventos/evento-adicionado";
	}
}
