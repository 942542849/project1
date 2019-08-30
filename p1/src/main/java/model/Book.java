package model;

public class Book {
	public static String[]sexs= {"不限","男","女"};
	public String getSexname() {
		return sexs[sex];
	}
	private int id;
	private String name;
	private int sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String name) {
		super();
		this.name = name;
	}
	
	

}
