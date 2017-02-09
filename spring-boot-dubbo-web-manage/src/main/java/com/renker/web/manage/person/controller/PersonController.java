package com.renker.web.manage.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.renker.dubbo.api.person.service.IPersonService;

@Controller
@RequestMapping("manage/person")
public class PersonController {
	
	@Reference(group="person")
	public IPersonService personService;
	
	@RequestMapping(value="index",method={RequestMethod.GET,RequestMethod.POST})
	public String index(){
		return "person/index";
	}
	
	@RequestMapping("home")
	public String home(){
		return "manage/person/person-home";
	}
}
