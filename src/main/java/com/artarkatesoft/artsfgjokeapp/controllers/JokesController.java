package com.artarkatesoft.artsfgjokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    @GetMapping({"/", ""})
    public String getJokesView() {

        return null;
    }


}
