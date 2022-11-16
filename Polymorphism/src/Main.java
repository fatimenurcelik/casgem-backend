import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		PointCalculator pointCalculator1 = new WomenPointCalculator();
		pointCalculator1.setFailures(5);
		pointCalculator1.setHits(4);
		pointCalculator1.calculate();
		PointCalculator pointCalculator3 = new WomenPointCalculator();
		pointCalculator3.setFailures(8);
		pointCalculator3.setHits(6);
		PointCalculator pointCalculator4 = new WomenPointCalculator();
		pointCalculator4.setFailures(9);
		pointCalculator4.setHits(6);
		PointCalculator pointCalculator5 = new WomenPointCalculator();
		pointCalculator5.setFailures(5);
		pointCalculator5.setHits(1);
		PointCalculator pointCalculator2 = new ManPointCalculator();
		pointCalculator2.setFailures(5);
		pointCalculator2.setHits(1);

		List<Gamer> gamers = new ArrayList<>();

		Gamer gamer1 = new Gamer(1, "Berna", "a", "arastýrmacý", pointCalculator1, "W");

		Gamer gamer2 = new Gamer(2, "Merve", "b", "merhametli", pointCalculator3, "W");

		Gamer gamer3 = new Gamer(3, "Fatma", "c", "azimli", pointCalculator4, "W");

		Gamer gamer4 = new Gamer(4, "Muhammet", "d", "uyuz", pointCalculator2, "M");

		Gamer gamer5 = new Gamer(5, "Gözde", "e", "iyi", pointCalculator5, "W");

		gamers.add(gamer1);
		gamers.add(gamer2);
		gamers.add(gamer3);
		gamers.add(gamer4);
		gamers.add(gamer5);

		System.out.println("******");

		for (Gamer gamer : gamers) {
			System.out.print(gamer.getName() + " : ");
			System.out.print(gamer.getGender() + " : ");
			System.out.print(gamer.getPointCalculator().getFailures() +" - "+ gamer.getPointCalculator().getHits()+ " ");
			gamer.getPointCalculator().calculate();
		}

	}
}
