import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		PointCalculator pointCalculator1 = new WomenPointCalculator();
		pointCalculator1.setHits(6);
		pointCalculator1.setFailures(5);
		PointCalculator pointCalculator3 = new WomenPointCalculator();
		pointCalculator3.setHits(8);
		pointCalculator3.setFailures(6);
		PointCalculator pointCalculator4 = new WomenPointCalculator();
		pointCalculator4.setHits(9);
		pointCalculator4.setFailures(6);
		PointCalculator pointCalculator5 = new WomenPointCalculator();
		pointCalculator5.setHits(1);
		pointCalculator5.setFailures(5);
		PointCalculator pointCalculator2 = new ManPointCalculator();
		pointCalculator2.setHits(1);
		pointCalculator2.setFailures(5);

		List<Gamer> gamers = new ArrayList<>();

		Gamer gamer1 = new Gamer(1, "Berna", "a", "arastýrmacý", pointCalculator1, "W");

		Gamer gamer2 = new Gamer(2, "Merve", "b", "merhametli", pointCalculator3, "W");

		Gamer gamer3 = new Gamer(3, "Fatime", "c", "azimli", pointCalculator4, "W");

		Gamer gamer4 = new Gamer(4, "Muhammet", "d", "uyuz", pointCalculator2, "M");

		Gamer gamer5 = new Gamer(5, "Gözde", "e", "iyi", pointCalculator5, "W");

		gamers.add(gamer1);
		gamers.add(gamer2);
		gamers.add(gamer3);
		gamers.add(gamer4);
		gamers.add(gamer5);

		for (Gamer gamer : gamers) {
			System.out.print(gamer.getNickname() +" "+ gamer.getName() +" : " );
			System.out.print(gamer.getGender() + " : ");
			System.out.print(gamer.getPointCalculator().getHits() + " - " + 
							 gamer.getPointCalculator().getFailures() + " ");
							 gamer.getPointCalculator().calculate();
		}

	}
}
