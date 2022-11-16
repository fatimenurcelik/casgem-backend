public class WomenPointCalculator extends PointCalculator{
	@Override
	public void calculate() {
		System.out.println("Women's Point Calculator : " + ((getHits() - getFailures()) * 10 + 50));
	}
}
