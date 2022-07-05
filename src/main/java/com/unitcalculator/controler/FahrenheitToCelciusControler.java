package com.unitcalculator.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FahrenheitToCelciusControler {
    @GetMapping ("/calculate-fahrenheit-to-celcius")
    @ResponseBody
    public String calculateFahrenheitToCelcius(@RequestParam String fahrenheit) {
        Double celcius = ((5*(Double.parseDouble(fahrenheit)-32))/9);
        return "Wynik " + celcius ;
         }
}

