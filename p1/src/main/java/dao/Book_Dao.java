package dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface Book_Dao {
	@Select("select * from book ${txt}")
	public List<Book> select();


}
