package com.renker.dubbo.service.person.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.renker.dubbo.api.person.service.IPersonService;

@Service(group="person",protocol={"dubbo"})
public class PersonService implements IPersonService{

	public String hellow(String msg) {
		return msg;
	}
	
}
