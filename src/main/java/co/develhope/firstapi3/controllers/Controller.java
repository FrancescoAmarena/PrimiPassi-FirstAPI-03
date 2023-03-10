package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value="/String")
    public String getString(@RequestParam String string1, String string2){

        if (string2==null) {return string1;}
        else {return string1+" "+string2;}

}


}
