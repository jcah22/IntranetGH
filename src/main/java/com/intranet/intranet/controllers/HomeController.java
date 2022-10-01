package com.intranet.intranet.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intranet.intranet.services.IRequisicionesService;

@Controller
public class HomeController {


    @Autowired
    private IRequisicionesService reqservice;


    Date date = new Date();
	Calendar calendar = Calendar.getInstance();

    @GetMapping("/")
    public String index(Model model, @RequestParam String filtro) {

        calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);

        model.addAttribute("saludo", "Intranet de Hosto");
        model.addAttribute("reqs", reqservice.findAllByQuery(filtro));
        model.addAttribute("fecha", dateYear);


        return "home";
    }

    @GetMapping("/sigloxxi")
    public String sigloxxi() {

        return "sigloxxi";
    }

    @GetMapping("/mecanz")
    public String mecanz() {

        return "mecanz";
    }

    @GetMapping("/zerey")
    public String zerey() {

        return "zerey";
    }

    @GetMapping("/pcmm")
    public String pcmm() {

        return "pcmm";

    }

    @GetMapping("/tbn")
    public String tbn() {

        return "tbn";

    }

    @GetMapping("/amron")
    public String amron() {

        return "amron";
    }

    @GetMapping("/osonyer")
    public String osonyer() {

        return "osonyer";
    }

    @GetMapping("/len")
    public String len() {

        return "len";
    }

    @GetMapping("/lats")
    public String lats() {

        return "lats";
    }

    @GetMapping("/rakroj")
    public String rakroj() {

        return "rakroj";

    }

    @GetMapping("/ponderacion")
    public String ponderacion() {

        return "ponderacion";
    }

    @GetMapping("/saveEmpresa")
    public String saveEmpresa(){

        return "nuevaEmpresa";
    }

    @GetMapping("/saveReq")
    public String nuevaReq(){


        return "nuevaReq";
    }

    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(){

        return "nuevoUsuario";
    }

}
