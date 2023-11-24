
package dev.vorstu.controllers;

import dev.vorstu.db.dto.ShortUser;
import dev.vorstu.db.entities.auth.AuthUserEntity;
import dev.vorstu.db.repositories.AuthUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("api/teacher")
    public class TeacherController {
        @Autowired
        private AuthUserRepo authUserRepo;

        @GetMapping("/users")
        public Page<ShortUser> getAllUsers(
                @RequestParam(defaultValue = "0") int page,
                @RequestParam(defaultValue = "2") int size)
//                @RequestParam(defaultValue = "user_id") String sortColumn,
//                @RequestParam(defaultValue = "asc") String sortDirection)
               {

//            PageRequest pageRequest = PageRequest.of(page, size, Sort.by(Sort.Direction.valueOf(sortDirection.toUpperCase()),sortColumn));
                   PageRequest pageRequest = PageRequest.of(page, size);
            return authUserRepo.findAll(pageRequest)
                    .map(el -> new ShortUser(el.getRoleId(),el.getUsername(), el.getName(), el.getSurname()));
        }

        @PostMapping(value = "/users", consumes = "application/json", produces = "application/json")
//          value = "/students", produces = "application/json")
        public AuthUserEntity createStudent(@RequestBody AuthUserEntity user){
            authUserRepo.save(user);
            return user;
        }


        @DeleteMapping(value = "users/{user_id}")
        public Long deleteUser(@PathVariable("user_id") Long userId) {
            authUserRepo.deleteById(userId);
            return userId;
        }

    }
