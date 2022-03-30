package com.br.fiap.vacinas.controller;

import java.util.List;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.fiap.vacinas.model.Vacinas;
import com.br.fiap.vacinas.repository.VacinaRepository;

@RestController
public class VacinaController {

    @Autowired
    private VacinaRepository vacinaRepository;

    @RequestMapping("/")
    String index() {
        return "Vacina - Backend";
    }
    
    @CrossOrigin
    @RequestMapping("/vacinas")
    public List<Vacinas> vacinas(){
        return vacinaRepository.findAll();
    }
    
    
    @CrossOrigin
    @PostMapping(path = "/vacinas")
    public void save(@RequestBody Vacinas vacinas) {
    	System.out.println("opa" + vacinas);
        vacinaRepository.save(vacinas);
    }
    
    
    @CrossOrigin
    @PostMapping(path = "/send-email/email")
    @ResponseBody
    public String email(@RequestParam String email) {
    	Mensageria mg = new Mensageria();
    	
    	
    	 return mg.queuevacinas(email);
    }

    @CrossOrigin
    @PostMapping(path = "/cpf")
    public String validateCPF(@RequestBody String cpf) {
        JSONObject cpfJson = new JSONObject(cpf);
        return com.br.fiap.vacinas.helper.Helper.executePost("http://localhost:8091/validar", cpfJson);
    }

}


