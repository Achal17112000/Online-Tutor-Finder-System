package com.example.tutor_finder.services;

import com.example.tutor_finder.bean.Parent;
import com.example.tutor_finder.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository parentRepository;

    public Parent addParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public List<Parent> getAllParent() {
        List<Parent> li = new ArrayList<>();
        parentRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public Parent getParentById(long parentId) {
        return parentRepository.findById(parentId).get();
    }

    public Parent getParentByName(String name) {
        return parentRepository.findByName(name);
    }

    public Parent getParentByUsername(String username) {
        return parentRepository.findByUsername(username);
    }

    public Parent getParentByArea(String area) {
        return parentRepository.findByArea(area);
    }

    public Parent getParentByChildName(String childName) {
        return parentRepository.findByChildName(childName);
    }

    public Parent updateParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public void deleteParent(Parent parent) {
        parentRepository.delete(parent);
    }

    public void deleteParentById(long id) {
        parentRepository.deleteById(id);
    }

    public void deleteParentByUsername(String username) {
        parentRepository.deleteByUsername(username);
    }


}
