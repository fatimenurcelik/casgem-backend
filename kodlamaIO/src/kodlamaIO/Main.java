package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Course course6 = new Course();
		Course course5 = new Course();
		Course course4 = new Course();
		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(course6);
		courses1.add(course5);
		courses1.add(course4);

		Instructor instructor6 = new Instructor(1, "engin ", "img1", courses1);

		// course6 = new Course(1,"java","img1", "0", category1, instructor6);

		Instructor instructor1 = new Instructor();
		Course course1 = new Course();
		Category category1 = new Category();

		Instructor instructor2 = new Instructor();
		Course course2 = new Course();
		Category category2 = new Category();

		Instructor instructor3 = new Instructor();
		Course course3 = new Course(1, "python", "img3", "0", category1, instructor2);
		Category category3 = new Category();

		Instructor instructor4 = new Instructor();
		// Course course4 = new Course(1,"python","img3", "0", category1, instructor6);
		Category category4 = new Category();

		Instructor instructor5 = new Instructor();
		// Course course5 = new Course(1,"c#","img2", "0", category1, instructor6);
		Category category5 = new Category();

		// Course course6 = new Course(1,"java","img1", "0", category1, instructor6);

		List<Course> all = new ArrayList<Course>();
		all.add(course6);
		all.add(course5);
		all.add(course4);
		all.add(course3);
		all.add(course2);
		all.add(course1);

		Category category6 = new Category(1, "Kodlama", all);
	}

}
