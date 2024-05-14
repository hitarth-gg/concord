package com.concord.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PvtController {
    @GetMapping("/pvt")
    public String getPvt()
    {
        System.out.println("------------------------This is a private page----------------------------");
        return "This is a private page";
    }
}
