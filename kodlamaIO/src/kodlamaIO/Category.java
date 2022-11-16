package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private int id;
	private String name;
	private List<Course> courses;

	public Category(int id, String name, List<Course> courses) {

		this();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public Category() {
		courses = new ArrayList<Course>();
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

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

}
