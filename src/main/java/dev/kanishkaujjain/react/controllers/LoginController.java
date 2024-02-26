package dev.kanishkaujjain.react.controllers;

import dev.kanishkaujjain.react.entities.User;
import dev.kanishkaujjain.react.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserRepo repo;

    @PostMapping("/auth")
    public ResponseEntity<String> authenticateLogin(@RequestParam String username, @RequestParam String password) {
        User user = repo.findByEmailId(username).orElse(null);
        if (user != null) {
            String fetchedUsername = user.getEmailid();
            String fetchedPassword = user.getPass();

            if (username.equals(fetchedUsername) && password.equals(fetchedPassword)) {
                return new ResponseEntity<>("Login successful!", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Login denied!", HttpStatus.UNAUTHORIZED);
            }
        }
        else {
            return new ResponseEntity<>("User does not exist!", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveDetails(@RequestBody User user) {
        System.out.println("===============================================================================");
        System.out.println(user.toString());
        System.out.println("===============================================================================");
        repo.save(user);
        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }
}
