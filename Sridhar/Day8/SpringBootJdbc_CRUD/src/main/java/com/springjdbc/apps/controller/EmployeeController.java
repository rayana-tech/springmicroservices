package com.springjdbc.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springjdbc.apps.model.Employee;
import com.springjdbc.apps.repository.EmployeeRepository;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/viewlistofemployees")
    private String index(Model model){
        model.addAttribute("employees", repository.findAll());
        return "employees";
    }
    @PostMapping("/insert")
    private String insert(@ModelAttribute("employees") Employee employee){
        repository.save(employee);
        return "redirect:/";
    }
    @GetMapping("/updateForm")
    private String updateForm(@RequestParam("id") Long id, Model model){
        model.addAttribute("employees", repository.findById(id));
        return "form";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute("employees") Employee employee){
        repository.update(employee);
        return "redirect:/";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam("id") Long id){
        repository.deleteById(id);
        return "redirect:/";
    }
}
