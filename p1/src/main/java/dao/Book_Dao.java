package dao;



import java.util.List;


import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface Book_Dao {

	public List<Book> select(String txt );
	

	public Book selectById(int id);
	

	public void insert(Book t);
	
	public void update(Book t);
	
	public void delete(int id);


}
