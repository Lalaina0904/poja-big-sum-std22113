package com.hei.prog4.endpoint.rest.controller.bigSum;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@AllArgsConstructor
@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public BigInteger bigSum(@RequestParam BigInteger a, @RequestParam BigInteger b){
        return  a.add(b);
    }
}