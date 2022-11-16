public class ManPointCalculator extends PointCalculator{
	@Override
	public void calculate() {
		System.out.println("Men's Point Calculator : " + ((getHits() - getFailures()) * 10 + 100));
	}
}
