package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.User;


@Repository
public interface User_Dao {
	@Select("select User.* from User where name=#{name} and pass=#{pass}")
	public User login(User u);
	
	
	@Select("select * from user")
	public List<User> select();
	@Select("select * from user where id=#{id}")
	public User selectById(int id);
	@Insert("insert into (name) valuse(#{name})")
	public List<User> insert(User t);
	@Update("update user set name=#{name} where id=#{id}")
	public void update(User t);
	
	@Delete("delete from user where id=#{id} ")
	public void delete(int id);
	
}
