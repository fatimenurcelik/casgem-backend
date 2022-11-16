import java.util.List;

public class ProductManager {

	private List<Log> loggers;
	
	public List<Log> getLoggers() {
		return loggers;
	}

	public void setLoggers(List<Log> loggers) {
		this.loggers = loggers;
	}

	public void add(Product product ) {
		System.out.println(product.getName() +  " eklendi.");
		runLoggers();
		
	}
	
	public void update(Product product ) {
		System.out.println(product.getName() +  " güncellendi.");
		runLoggers();
		
	}
	
	private void runLoggers() {
		for (Log log : loggers) {
			log.yazdir();
		}
	}
	
}
