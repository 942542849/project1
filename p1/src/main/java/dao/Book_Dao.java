package dao;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface Book_Dao {

	public List<Book> select(String txt );
	

	public Book selectById(int id);
	

	public void insert(Book t);
	
	public void update(Book t);
	
	public void delect(int id);


}
