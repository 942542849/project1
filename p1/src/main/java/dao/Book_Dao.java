package dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface Book_Dao {
	@Select("select book.*,Type.name Typename from book inner join type on book.typeid=type.id ${txt}")
	public List<Book> select(@Param("txt") String txt );


}
