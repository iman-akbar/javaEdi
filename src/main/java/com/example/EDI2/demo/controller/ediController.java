package com.example.EDI2.demo.controller;

import com.example.EDI2.demo.model.tblUser;
import com.example.EDI2.demo.repository.ediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api")
public class ediController {
    @Autowired

    private ediRepository Repository;
    @PostMapping(path="/add")
//    public @ResponseBody String addData (@RequestParam String namalengkap
//            , @RequestParam String username, @RequestParam String password, @RequestParam String status) {
//
//
//        tblUser n = new tblUser();
//        n.setName(namalengkap);
//        n.setUsername(username);
//        n.setPassword(password);
//        n.setStatus(status);
//        Repository.save(n);
//        return "Repository.findAll().toString()";
//    }
    public String postData(@RequestBody tblUser TblUser) {
         Repository.save(TblUser);
         return "berhasil";
    }

    @GetMapping(path="/all")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public @ResponseBody Iterable<tblUser> getAllUsers() {

        return Repository.findAll();
    }
}
