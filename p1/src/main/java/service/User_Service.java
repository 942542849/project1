package service;

import java.util.List;

import model.User;
import model.User;

public interface User_Service {
	
		public User login(User u);
		
		public List<User> select();
		
		public User selectById(int id);
		
		public void insert(User t);

		public void update(User t);

		public void delete(int id);
}
