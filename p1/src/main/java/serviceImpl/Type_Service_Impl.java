package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import model.Type;
import service.Type_Service;

@Service
public class Type_Service_Impl implements Type_Service {
@Autowired
Type_Dao dao;

public List<Type> select() {
	// TODO Auto-generated method stub
	return dao.select();
}

public Type selectById(int id) {
	// TODO Auto-generated method stub
	return dao.selectById(id);
}

public void insert(Type t) {
	// TODO Auto-generated method stub
	dao.insert(t);
}

public void update(Type t) {
	// TODO Auto-generated method stub
	dao.update(t);
}

public void delete(int id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

}
