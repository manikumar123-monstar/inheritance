package mani;

public class City {
	static String city_name = "banglore";
	static int city_population = 300000;
	static int city_latitude = 345678;
	 void city_details() {
		System.out.println("city name  =  banglore");
		System.out.println("city population  = 1000000");
		System.out.println("city latitude = 12345567");
	

		
	}
	public static void main(String args[]) {
		
		City c = new City();
		c.city_details(); 
		
		
	}
	

	
	

}
