package kodlamaIO;

public class Course {
	private int id;
	private String name;
	private String image;
	private String completedState;
	private Category category;
	private Instructor instructor ;
	
	
	public Course() {
		category=new Category();
		instructor = new Instructor();
	}

	public Course(int id, String name, String image, String completedState, Category category, Instructor instructor) {
		
		this();
		this.id = id;
		this.name = name;
		this.image = image;
		this.completedState = completedState;
		this.category=category;
		this.instructor = instructor;
	}

	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public String getCompletedState() {
		return completedState;
	}

	public void setCompletedState(String completedState) {
		this.completedState = completedState;
	}
	
}
