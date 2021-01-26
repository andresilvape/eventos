package com.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.domain.Evento;
import com.eventos.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	EventoRepository eventorepository;

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "/formEvento";
	}

	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String form(Evento evento) {
		eventorepository.save(evento);

		return "redirect:/cadastrarEvento";
	}
	
	  @RequestMapping(value="/listarEvento")
	  public ModelAndView listaEventos() {
	  ModelAndView mv = new ModelAndView("listarEvento"); 
	  Iterable<Evento> eventos= eventorepository.findAll();
	  mv.addObject("eventos", eventos);
	  return mv;
	  }
	 

	@RequestMapping(value = "/listarEvento2")
	public String listar() {
		return "listarEvento";
	}

	/*
	 * @RequestMapping(value = "/listarEvento", method = RequestMethod.GET) public
	 * Iterable<Evento> listaEventos() { return eventorepository.findAll(); }
	 */

}
