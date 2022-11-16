public class WomenPointCalculator extends PointCalculator{
	@Override
	public void calculate(int hits, int failures) {
		System.out.println("Women's Point Calculator : " + ((hits - failures) * 10 + 50));
	}
}
