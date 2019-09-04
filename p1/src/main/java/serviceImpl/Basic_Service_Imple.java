package serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import service.BasicService;

@Service
public class Basic_Service_Imple<T> implements BasicService<T>{


private Object execDao(String mname,Object... objs){
	try {
	Field f=this.getClass().getDeclaredField("dao");
	f.setAccessible(true);
	Object dao=f.get(this);
		
	Class cls=dao.getClass();  
	Class[] cs=new Class[objs.length];
	for(int i=0;i<objs.length;i++)cs[i]=objs[i].getClass();
	Method m= cls.getMethod(mname, cs);
	m.setAccessible(true);
	return m.invoke(dao, objs);
	}catch (Exception e) {
		e .printStackTrace();
		return null;
	}
	
}

public List<T> getWhere(String where) {
	Object o=execDao("getWhere", where);
	if(o!=null) return (List<T>) o;
	else return new ArrayList<T>();
}

public List<T> getAll() {
	Object o=execDao("getAll");
	if(o!=null) return (List<T>) o;
	else return new ArrayList<T>();
}

public T getByid(Integer id) {
	Object o=execDao("getByid",id);
	if(o!=null) return (T) o;
	else return null;
}

public int delete(Integer id) {
	Object o=execDao("delete",id);
	if(o!=null) return (Integer) o;
	else return -2;
}

public Integer insert(T t) {
	Object o=execDao("insert",t);
	if(o!=null) return (Integer) o;
	else return -2;
}

public Integer update(T t) {
	Object o=execDao("update",t);
	if(o!=null) return (Integer) o;
	else return -2;
}


}
