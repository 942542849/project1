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
	@Select("select book.*,Type.name Typename from book inner join type on book.typeid=type.id ${txt}")
	public List<Book> select(@Param("txt") String txt );
	
	@Select("select book.*,Type.name from book inner join type on book.typeid=type.id where book.id=#{id}")
	public Book selectById(int id);
	
	@Insert("insert into book(name,sex,typeid) values(#{name},#{sex},#{typeid})")
	public void insert(Book t);
	
	@Update("update book set name=#{name},sex=#{sex},typeid=#{typeid} where id=#{id}")
	public void update(Book t);
	
	@Delete("delete from book where id=#{id}")
	public void delect(int id);


}
