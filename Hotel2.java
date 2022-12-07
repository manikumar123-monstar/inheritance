package Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hotel2 {

	public static void main(String[] args) {
		/*
		 * Hotel h=new Hotel("mani",350000,6,15); Hotel h2=new
		 * Hotel("SaiPrasad",150000,6,15); Hotel h3=new Hotel("Ajayn",250400,6,15);
		 */
		
		Hotel hot=new Hotel();
		 hot.setHotel_name("Spicey");
		 hot.setHotel_items(3);
		 hot.setHotel_staf(30);
		 hot.setHotel_rent(40000);
		 
		 Hotel hot1=new Hotel();
		 hot1.setHotel_name("Jaff");
		 hot1.setHotel_items(8);
		 hot1.setHotel_staf(20);
		 hot1.setHotel_rent(15000);
		 
		 Hotel hot2=new Hotel();
		 hot2.setHotel_name("Barkas");
		 hot2.setHotel_items(6);
		 hot2.setHotel_staf(45);
		 hot2.setHotel_rent(20000);
		 
		ArrayList<Hotel> al=new ArrayList<Hotel>();
		al.add(hot);
		al.add(hot1);
		al.add(hot2);
//System.out.println(al);
//Collections.sort(null, null)
Comparator<Hotel> com=new Comparator<Hotel>() {

	public int compare(Hotel o1, Hotel o2) {
		// TODO Auto-generated method stub
		return o1.hotel_name.compareTo(o2.hotel_name);
		
		
	}
	
};

Collections.sort(al, com);
System.out.println(al);
		                

	}

}
