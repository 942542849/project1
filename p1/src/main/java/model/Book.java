package model;

import java.io.Serializable;

public class Book implements Serializable{
	private Integer sex;
	public static String[] sexs= {"未知","男","女"};
	public String getSexname() {
		return sexs[sex];
	}
	
	

	private Integer typeid;
	private String typename;
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}


	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

}