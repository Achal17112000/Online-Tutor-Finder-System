package com.example.tutor_finder.controller;

import com.example.tutor_finder.Exception.NotFoundException;
import com.example.tutor_finder.bean.Parent;
import com.example.tutor_finder.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParentController {

    @Autowired
    ParentService parentService;

    @PostMapping("/addParent")
    Parent addParent(@RequestBody Parent parent){
        return parentService.addParent(parent);
    }

    @GetMapping("/getParents")
    List<Parent> getParent() {
        return parentService.getAllParent();
    }

    @GetMapping("/getParentById/{parentId}")
    Parent getParentById(@PathVariable("parentId") long parentId) {
        return parentService.getParentById(parentId);
    }

    @GetMapping("/getParentByName/{parentName}")
    Parent getParentByName(@PathVariable("parentName") String parentName) {
        return parentService.getParentByName(parentName);
    }

    @GetMapping("/getParentByUsername/{username}")
    Parent getParentByUserName(@PathVariable("username") String username) {
        return parentService.getParentByUsername(username);
    }

    @GetMapping("/getParentByArea/{area}")
    Parent getParentByArea(@PathVariable("area") String area) {
        return parentService.getParentByArea(area);
    }

    @GetMapping("/getParentByChildName/{childName}")
    Parent getParentByChildName(@PathVariable("childName") String childName) {
        return parentService.getParentByChildName(childName);
    }

    @PutMapping("/updateParent")
    Parent updateParent(@RequestBody Parent parent) {
        return parentService.updateParent(parent);
    }

    @DeleteMapping("/deleteParent")
    void deleteParent(@RequestBody Parent parent) {
        parentService.deleteParent(parent);
    }

    @DeleteMapping("/deleteParentById/{parentId}")
    void deleteParentById(@PathVariable("parentId") long parentId){
        parentService.deleteParentById(parentId);
    }

    @DeleteMapping("/deleteParentByUsername/{username}")
    void deleteParentByUsername(@PathVariable("username") String username) {
        parentService.deleteParentByUsername(username);
    }

}
