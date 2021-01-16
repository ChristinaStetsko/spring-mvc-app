package com.stetsko.controller.warrior;

import com.stetsko.model.Warrior;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(name = "/warriors")
public class WarriorController {

    @GetMapping
    public String getWarriorPage() {
        return "warrior";
    }

    @ModelAttribute("warrior")
    public Warrior getWarrior() {
        return new Warrior();
    }

    @GetMapping("/{id}")
    public String getWarriorsPage(Model model, @PathVariable("id") Optional<String> warriorId) {
        Warrior warrior = new Warrior();
        if (warriorId.isPresent()) {
            System.out.println(warriorId.get());
        }
        warrior.setName("Din");
        warrior.setSurname("Djarin");
        warrior.setMembership("Mandalore");
        warrior.setWeapon("blaster");
        model.addAttribute("warrior", new Warrior());
        return "warrior";
    }

    public ModelAndView addWarrior(@ModelAttribute Warrior warrior, BindingResult result) {
        if (warrior == null) {
            throw new IllegalArgumentException("No warrior created");
        }
        return new ModelAndView("warrior", "createdWarrior", warrior);
    }
}