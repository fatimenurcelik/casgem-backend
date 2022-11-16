package playGround;

public class MyList<T> {
	
	private  Object[] array = new Object[0];
	
	public void add(T item) {
		
		Object [] tempArray = array;
		
		array = new Object[array.length + 1];
		
		for(int i =0; i<tempArray.length; i++) {
			array[i] = tempArray[i];
		}
		array[tempArray.length] = item;
	}
	
	public int size() {
		return array.length;
	}
}
