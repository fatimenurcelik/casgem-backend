import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Log log1 = new Cloud();
		Log log2 = new DbLogger();
		Log log3 = new FileLogger();
		Log log4 = new ElasticSearchLogger();
		
		List<Log> loggers = new ArrayList<Log>();
		loggers.add(log1);
		loggers.add(log4);
		loggers.add(log3);
		
		
		Product product = new Product(1,"Elma",5);
		ProductManager productmanager = new ProductManager();
		
		
		
		productmanager.setLoggers(loggers);
		//liste olarak gönder
		productmanager.add(product);
		
		productmanager.update(product);
		
	}

}
