package br.com.itexto.springforum.controladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.itexto.springforum.model.DAOAssunto;
import br.com.itexto.springforum.model.DAOUsuario;

@Controller
public class HomeController {
	
	@Autowired
	private DAOUsuario daoUsuario;
	
	@Autowired
	private DAOAssunto daoAssunto;
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		model.put("assuntos", daoAssunto.list());
		model.put("usuarios", daoUsuario.list());
		return "index";
	}

}
