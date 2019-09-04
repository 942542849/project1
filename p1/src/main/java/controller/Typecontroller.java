package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Type;

import service.Type_Service;
import serviceImpl.Type_Service_Impl;

@Controller
@RequestMapping("Type")
public class Typecontroller extends Basiccontroller<Type> {
	@Autowired
	Type_Service service;
	
}