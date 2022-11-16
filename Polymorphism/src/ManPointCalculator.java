public class ManPointCalculator extends PointCalculator{
	@Override
	public void calculate(int hits, int failures) {
		System.out.println("Men's Point Calculator : " + ((hits - failures) * 10 + 100));
	}
}
