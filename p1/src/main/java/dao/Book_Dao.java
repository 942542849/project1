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
	@Select("select count(1) from book inner join type on type.id=book.typeid ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select book.*,type.name typename from book inner join type on type.id=book.typeid where book.id=#{id}")
	public Book selectById(int id); 
	@Select("select book.*,type.name typename from book inner join type on type.id=book.typeid ${txt} ORDER BY book.id ${limit}")
	public List<Book> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select book.*,type.name typename from book inner join type on type.id=book.typeid")
	public List<Book> selectAll();
	@Insert("insert into book(name,sex,typeid) values(#{name},#{sex},#{typeid})")
	public void insert(Book t);
	@Update("update book set name=#{name},sex=#{sex},typeid=#{typeid} where id=#{id}")
	public void update(Book t);
	@Delete("delete from book where id=#{id}")
	public void delete(int id);
}
