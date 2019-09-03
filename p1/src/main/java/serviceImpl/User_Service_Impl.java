package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.User_Dao;
import model.User;
import service.User_Service;

@Service
public class User_Service_Impl implements User_Service {
@Autowired
User_Dao dao;

public List<User> select() {
	// TODO Auto-generated method stub
	return dao.select();
}

public User selectById(int id) {
	// TODO Auto-generated method stub
	return dao.selectById(id);
}

public void insert(User t) {
	// TODO Auto-generated method stub
	dao.insert(t);
}

public void update(User t) {
	// TODO Auto-generated method stub
	dao.update(t);
}

public void delete(int id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

public User login(User u) {
	// TODO Auto-generated method stub
	return dao.login(u);
}

}
