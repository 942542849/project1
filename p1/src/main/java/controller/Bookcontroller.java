package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Book_Service;
import service.Impl.Book_Service_Impl;

@Controller
public class Bookcontroller {
		@Autowired
		Book_Service service;
		@RequestMapping("index")
		public String index(String txt,ModelMap m){
			String where1="";
			if(txt!=null) {
				where1="where book.name like '%"+txt+"%'";
			}
			m.put("list", service.select(where1));
			return "index";
		}

	
}
