package com.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.domain.Evento;
import com.eventos.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	EventoRepository eventorepository;
	
	@GetMapping(value = "/eventos")
	public String form() {
		return "/formEvento";
	}

	@RequestMapping(value = "/eventos", method = RequestMethod.POST)
	public String form(Evento evento) {
		eventorepository.save(evento);

		return "redirect:/eventos";
	}
	
	  @RequestMapping(value="/eventos-adicionados")
	  public ModelAndView listaEventos() {
	  ModelAndView mv = new ModelAndView("listarEvento"); 
	  Iterable<Evento> eventos= eventorepository.findAll();
	  mv.addObject("eventos", eventos);
	  return mv;
	  }
}
