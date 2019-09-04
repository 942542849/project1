package controller;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BasicService;
import serviceImpl.Basic_Service_Imple;



@Controller
public class Basiccontroller<T>  {
	
	Basic_Service_Imple<T> basicservice;
	
	@ModelAttribute
	public void init() throws Exception{
		Field f=this.getClass().getDeclaredField("service");
		f.setAccessible(true);
		Object dao=f.get(this);
		basicservice=(Basic_Service_Imple<T>) dao;
	}
	
	private String getTname() {
		return getRealType().getSimpleName();
	}
	
	public Class getRealType(){

		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();

		return (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	
	
	@RequestMapping("index")
	public String index(ModelMap m,HttpServletRequest req) {
		m.put("list", basicservice.getWhere(""));
		return getTname()+"/index";
	}
	
	
	
	@RequestMapping("delete")
	public String delete(Integer id,ModelMap m,HttpServletRequest req) {
		basicservice.delete(id);
		 return index( m,req);
	}
	
	@RequestMapping("add")
	public String add(ModelMap m,HttpServletRequest req) {
		return getTname()+"/edit";
	}
	@RequestMapping("edit")
	public String edit(Integer id,ModelMap m,HttpServletRequest req) {
		m.put("info", basicservice.getByid(id));
		return add( m,req);
	}
	
	@RequestMapping("insert")
	public String insert(  T t,ModelMap m,HttpServletRequest req) {
		basicservice.insert(t);
			return index( m,req);
	}
	@RequestMapping("update")
	public String update(T t,ModelMap m,HttpServletRequest req) {
		basicservice.update(t);
		return index( m,req);
	}
}