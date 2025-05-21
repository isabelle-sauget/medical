package com.metaminds.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private Map<String, String> users = new HashMap<>(); 

    @PostMapping("/signup")
    public String signup(@RequestBody SignUpRequest request) {
        if (userRepo.findByCNP(request.getCNP()).isPresent()) {
            throw new RuntimeException("CNP deja inregistrat!");
        }

         User newUser = new User();
         newUser.setCNP(request.getCNP());
         newUser.setPassword(request.getPassword());
         newUser.setEmail(request.getEmail());
         newUser.setTipUtilizator(request.getTipUtilizator().toUpperCase());
         newUser.setFullName(request.getFullName());
         newUser.setNrTelefon(request.getNrTelefon());
         newUser.setSpecializare(request.getSpecializare());
         newUser.setDataNasterii(request.getDataNasterii());

        userRepo.save(newUser);
        return "Utilizator inregistrat ca fiind " + newUser.getTipUtlizator();
    }



    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String storedPassword = users.get(user.getPassword());
        if (storedPassword != null && storedPassword.equals(user.getPassword())) {
            return "Logat cu succes!"; // In a real application, you would return a JWT token here
        } else {
            return "Parola gresita!";
        }
    }
}


