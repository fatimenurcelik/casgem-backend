package playGround;

public class Main {

	public static void main(String[] args) {
		String [] cities = {"Ankara" ,"�stanbul", "�zmir"};
		String newCity = "Eski�ehir";
		
		for (int i = 0; i< cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		MyList<String> mylist=new  MyList<String>();
		mylist.add("jvkjsd");
		System.out.println(mylist.size());
		
	}

}
