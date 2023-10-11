package com.codedecode.docker.controller;

import com.codedecode.docker.model.DatabaseDetails;
import com.codedecode.docker.model.settingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/docker")
public class DokerDemocontroller {
    @Autowired
    private DatabaseDetails databaseDetails;

    @GetMapping("testAPI")
    public settingResponse testMethod(@RequestParam String name) {
        settingResponse se=new settingResponse();
        if(name.equalsIgnoreCase("manoj")) {
            se.setName(databaseDetails.name);
            se.setCompany(databaseDetails.company);
            se.setGender(databaseDetails.gender);
            se.setSalary(databaseDetails.salary);
            return se;
        }
        return null;
    }

}
