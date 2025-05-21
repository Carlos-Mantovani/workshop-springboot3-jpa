package com.carlosmantovani.course.resources;

import com.carlosmantovani.course.entities.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Carlos", "carlos_mantovani@protonmail.com", "11937219107", "senha123");
        return ResponseEntity.ok().body(u);
    }
}
