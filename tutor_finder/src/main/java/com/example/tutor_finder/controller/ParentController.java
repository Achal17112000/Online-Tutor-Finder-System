package com.example.tutor_finder.controller;

import com.example.tutor_finder.Exception.ApiRequestException;
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
        if(parent == null)
            throw new ApiRequestException("Please enter valid details");
        return parentService.addParent(parent);
    }

    @GetMapping("/getParents")
    List<Parent> getParent() {
        if(parentService.getAllParent() == null)
            throw new ApiRequestException("No Content available");
        return parentService.getAllParent();
    }

    @GetMapping("/getParentById/{parentId}")
    Parent getParentById(@PathVariable("parentId") long parentId) {
        if(parentService.getParentById(parentId) == null)
            throw new ApiRequestException("User not found with id " + parentId);
        return parentService.getParentById(parentId);
    }

    @GetMapping("/getParentByName/{parentName}")
    Parent getParentByName(@PathVariable("parentName") String parentName) {
        if(parentService.getParentByName(parentName) == null)
            throw new ApiRequestException("User not found with name " + parentName);
        return parentService.getParentByName(parentName);
    }

    @GetMapping("/getParentByUsername/{username}")
    Parent getParentByUserName(@PathVariable("username") String username) {
        if(parentService.getParentByUsername(username) == null)
            throw new ApiRequestException("User not found with username " + username);
        return parentService.getParentByUsername(username);
    }

    @GetMapping("/getParentByArea/{area}")
    Parent getParentByArea(@PathVariable("area") String area) {
        if(parentService.getParentByArea(area) == null)
            throw new ApiRequestException("User not found");
        return parentService.getParentByArea(area);
    }

    @GetMapping("/getParentByChildName/{childName}")
    Parent getParentByChildName(@PathVariable("childName") String childName) {
        if(parentService.getParentByChildName(childName) == null)
            throw new ApiRequestException("Parent not found");
        return parentService.getParentByChildName(childName);
    }

    @PutMapping("/updateParent")
    Parent updateParent(@RequestBody Parent parent) {
        if(parent == null)
            throw new ApiRequestException("User not found");
        return parentService.updateParent(parent);
    }

    @DeleteMapping("/deleteParent")
    void deleteParent(@RequestBody Parent parent) {
        if(parent == null)
            throw new ApiRequestException("Please enter valid details");
        parentService.deleteParent(parent);
    }

    @DeleteMapping("/deleteParentById/{parentId}")
    void deleteParentById(@PathVariable("parentId") long parentId){
        if(parentService.getParentById(parentId) == null)
            throw new ApiRequestException("User not found with id " + parentId);
        parentService.deleteParentById(parentId);
    }

    @DeleteMapping("/deleteParentByUsername/{username}")
    void deleteParentByUsername(@PathVariable("username") String username) {
        if(parentService.getParentByUsername(username) == null)
            throw new ApiRequestException("User not found with username " + username);
        parentService.deleteParentByUsername(username);
    }

}
