package io.bootify.my_app.controller;

import io.bootify.my_app.domain.Houses;
import io.bootify.my_app.repos.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class HomeController {

    @Autowired
    private HousesRepository repo;
    @GetMapping("/")
    public List<Houses> indesdfghjx() {
        return repo.findAll();
    }
    @GetMapping("house/{zip}")
    public List<Houses> getbyzip(@PathVariable String zip) {
        return repo.findByZipCode(zip);
    }

}
