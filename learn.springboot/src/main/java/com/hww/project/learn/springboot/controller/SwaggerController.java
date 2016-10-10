package com.hww.project.learn.springboot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hww.project.learn.springboot.model.User;
import com.hww.project.learn.springboot.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/users")
public class SwaggerController {
    
    /*
     *  http://localhost:8080/swagger/index.html
     */
	
	
	@Autowired
    private UserService userService;
 
    @ApiOperation(value="Get all users",notes="requires noting")
    @RequestMapping(method=RequestMethod.GET)
    public List<User> getUsers(){
    	return userService.getAllUser();
    }
 
    @ApiOperation(value="Get user with id",notes="requires the id of user")
    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public User getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
}
