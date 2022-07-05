package com.unitcalculator.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CelciusToFahrenheitControler {

    @GetMapping("/calculate-celcius-to-fahrenheit")
    @ResponseBody
    public String calculateCelciusToFahrenheit(@RequestParam String celcius) {
        Double fahrenheit = ((Double.parseDouble(celcius)*9)/5)+32;

        return "Wynik " + fahrenheit;
    }

}