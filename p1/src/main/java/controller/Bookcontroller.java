package controller;



import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Book;
import service.Book_Service;
import service.Type_Service;

@Controller
@RequestMapping("Book")
public class Bookcontroller {
		@Autowired
		Book_Service bservice;
		@Autowired
		Type_Service tservice;
		@RequestMapping("index")
		public String index(String txt,ModelMap m){
			String where1="";
			if(txt!=null) {
				where1="where book.name like '%"+txt+"%'";
			}
			m.put("list", bservice.select(where1));
			return "Book/index";
		}
		
		@RequiresPermissions("aaa")
		@RequestMapping("add")
		public String add(ModelMap m) {
			m.put("sexs", Book.sexs);
			m.put("typelist", tservice.select());
			return"Book/edit";
		}

		@RequestMapping("edit")
		public String edit(int id,ModelMap m) {
			m.put("info", bservice.selectById(id));
			return add(m);
		}
		
		@RequestMapping("insert")
		public String insert(Book b,ModelMap m) {
			bservice.insert(b);
			return index(null,m);
		}
		
		@RequestMapping("update")
		public String  update(Book b,ModelMap m) {
			bservice.update(b);
			return index(null,m);
		}
		@RequestMapping("delete")
		public String  delete(int id,ModelMap m) {
			bservice.delete(id);
			return index(null,m);
		}
	
}
