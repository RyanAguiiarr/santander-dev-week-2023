package me.ryan.santander_dev_week_2023.controller;

import me.ryan.santander_dev_week_2023.domain.models.User;
import me.ryan.santander_dev_week_2023.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        var userCreated = userService.create(user);
        return ResponseEntity.ok(userCreated);
    }

}
