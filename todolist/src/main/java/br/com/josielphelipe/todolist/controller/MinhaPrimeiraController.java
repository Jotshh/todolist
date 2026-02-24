package br.com.josielphelipe.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:9999/primeiraRota/
//tive que colocar 9999 pq a outra porta tava ocupada, verificar arquivo application.properties em 
//C:\Users\josie\Downloads\CURSO-JAVA-ROCKETSEAT\todolist\todolist\src\main\resources\application.properties
public class MinhaPrimeiraController {  

    @GetMapping("/tchau")
    

    public String primeiraMensagem(){
        return "tchau";
    }
}
