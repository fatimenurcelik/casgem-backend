public class Gamer {
	private int id;
	private String name;
	private String surname;
	private String nickname;
	private String gender;
	private PointCalculator pointCalculator;

	public Gamer() {
		pointCalculator = new PointCalculator();
	}

	public Gamer(int id, String name, String surname, String nickname, PointCalculator pointCalculator, String gender) {
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.pointCalculator = pointCalculator;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public PointCalculator getPointCalculator() {
		return pointCalculator;
	}

	public void setPointCalculator(PointCalculator pointCalculator) {
		this.pointCalculator = pointCalculator;
	}

}
