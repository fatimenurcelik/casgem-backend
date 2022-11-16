import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		PointCalculator pointCalculator1 = new WomenPointCalculator();
		pointCalculator1.calculate(5, 2);
		PointCalculator pointCalculator3 = new WomenPointCalculator();
		pointCalculator3.calculate(3, 2);
		PointCalculator pointCalculator4 = new WomenPointCalculator();
		pointCalculator4.calculate(2, 2);
		PointCalculator pointCalculator5 = new WomenPointCalculator();
		pointCalculator5.calculate(8, 2);
		PointCalculator pointCalculator2 = new ManPointCalculator();
		pointCalculator2.calculate(6, 2);

		List<Gamer> gamers = new ArrayList<>();

		Gamer gamer1 = new Gamer(1, "Berna", "a", "arastýrmacý", pointCalculator1, "W");
		gamer1.setPointCalculator(pointCalculator1);

		Gamer gamer2 = new Gamer(2, "Merve", "b", "merhametli", pointCalculator3, "W");
		gamer2.setPointCalculator(pointCalculator3);

		Gamer gamer3 = new Gamer(3, "Fatma", "d", "azimli", pointCalculator4, "W");
		gamer3.setPointCalculator(pointCalculator4);

		Gamer gamer4 = new Gamer(4, "Muhammet", "d", "uyuz", pointCalculator2, "M");
		gamer4.setPointCalculator(pointCalculator2);

		Gamer gamer5 = new Gamer(5, "Gözde", "e", "iyi", pointCalculator5, "W");
		gamer5.setPointCalculator(pointCalculator5);

		gamers.add(gamer1);
		gamers.add(gamer2);
		gamers.add(gamer3);
		gamers.add(gamer4);
		gamers.add(gamer5);

		System.out.println("******");

		for (Gamer gamer : gamers) {
			System.out.print(gamer.getName() + " : ");
			System.out.print(gamer.getGender() + " : ");
			gamer.getPointCalculator().calculate(0, 0);
		}

	}
}
