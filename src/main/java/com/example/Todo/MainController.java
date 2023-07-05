package com.example.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "todo/")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewToDo(@RequestParam int id,@RequestParam String title, @RequestParam String desc){
        User user = new User();
        user.setId(id);
        user.setTitle(title);
        user.setDescription(desc);
        userRepository.save(user);
        return "Success";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/get")
    public @ResponseBody User getUserByID(@RequestParam int id){
       return userRepository.findById(id).get();
    }

    @GetMapping(path = "/delete")
    public @ResponseBody String deleteUserByID(@RequestParam int id){
        userRepository.deleteById(id);
        return "Success";
    }
}
