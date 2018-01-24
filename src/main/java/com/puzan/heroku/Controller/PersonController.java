/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puzan.heroku.Controller;

import com.puzan.heroku.DAO.PersonDAO;
import com.puzan.heroku.Entity.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author puzansakya
 */
@Controller
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    private PersonDAO pd;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Person> index(Model model) {
        return pd.getAll();
    }
}
