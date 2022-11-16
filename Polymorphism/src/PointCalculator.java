public class PointCalculator {

	private int hits;
	private int failures;

	public void calculate() {
		System.out.println("Basic Calculator : " + (getHits() - getFailures()) * 10);
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getFailures() {
		return failures;
	}

	public void setFailures(int failures) {
		this.failures = failures;
	}

}
