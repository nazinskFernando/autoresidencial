package com.autoresidencia.autoresidencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixadagua")
public class CaixaDaguaController {

    @GetMapping("/start")
    public boolean setStartCaixaDagua(){
        System.out.println(
                "entrada"
        );
        return true;
    }
}
