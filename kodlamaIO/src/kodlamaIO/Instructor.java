package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	private int id;
	private String name;
	private String image;
	private List<Course> courses;
	
	public Instructor() {
		courses =new ArrayList<Course>();
	}

	public Instructor(int id, String name, String image, List<Course> courses) {
		
		this();
		this.id = id;
		this.name = name;
		this.image = image;
		this.courses=courses;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
