package com.autoresidencia.autoresidencia.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixadagua")
public class CaixaDaguaController {
    Logger logger = LoggerFactory.getLogger(CaixaDaguaController.class);

    @GetMapping("/start")
    public boolean setStartCaixaDagua(){
        logger.info("entrou");
        return true;
    }
}
