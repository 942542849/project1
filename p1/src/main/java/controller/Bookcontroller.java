package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Book;
import service.Book_Service;

@Controller
public class Bookcontroller {
		@Autowired
		Book_Service bservice;
		@RequestMapping("index")
		public @ResponseBody List<Book> index(){
			return bservice.select();
		}

	
}
