package com.stetsko.controller.weapon;

import com.stetsko.dao.weapon.WeaponDAO;
import com.stetsko.entity.weapon.WeaponEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/weapons")
public class WeaponController {

    private WeaponDAO weaponDAO;

    @ModelAttribute
    public ModelAndView weapons(){
        return new ModelAndView("weapons", "weapons", weaponDAO.getAll());
    }

    @ModelAttribute("weapons")
    public List<WeaponEntity> getWeapons(){
        return weaponDAO.getAll();
    }

    @Autowired
    public void setWeaponDAO(WeaponDAO weaponDAO) {
        this.weaponDAO = weaponDAO;
    }
}
