
public class Main {

	public static void main(String[] args) {
		
		//1-1000 aras�ndaki asal say�lar� yazd�rma 
		
		  int sayac = 0; 
		  for(int i=2; i<1000; i++) { 
			  for(int j=1; j<=i; j++) { 
				  if(i % j == 0 ) { 
					  sayac++; 
					  } 
				  } 
			  if(sayac == 2 ) { 
				  System.out.println(i + " asal say�d�r"); 
				  } 
			  sayac = 0; 
			}
		 
		//1-1000 aras�ndaki m�kemmel say�lar� yazd�rma 
		  
		int sum =0;
		
		for(int i = 1;i <1000; i++) {
			for(int j=1; j<i; j++) {
				if(i % j== 0) {
					sum += j;
				}	
			}
			if(sum == i) {
				System.out.println(i + " m�k say�d�r ");
			}
			sum=0;
		}
	}

}
