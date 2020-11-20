package org.codejudge.sb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @RequestMapping("api/add")
    public Ans Sum(Number number){

        System.out.println(number);

        Ans ans = new Ans();
        ans.setSum(number.getNumber1()+number.getNumber2());


        return ans;
    }
}
