package com.example.springbook23demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/names")
public class GroupController {

    List<String> names = new ArrayList<>();

    @GetMapping("/{id}")
    String getAName(@PathVariable int id) {
        return names.get(id);
    }
    @GetMapping()
    List<String> getNames(){
        return names;
    }
    @PostMapping()
    String addName(@RequestBody String name) {
        names.add(name);
        return name;
    }

}
