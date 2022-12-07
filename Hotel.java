package Exception;

public class Hotel {
	String hotel_name;
	int hotel_rent;
	int hotel_items;
	int hotel_staf;

	
	

	

	@Override
	public String toString() {
		return "Hotel [hotel_name=" + hotel_name + ", hotel_rent=" + hotel_rent + ", hotel_items=" + hotel_items
				+ ", hotel_staf=" + hotel_staf + "]";
	}

	/*
	 * public Hotel() { this.hotel_name=hotel_name; this.hotel_items=hotel_items;
	 * this.hotel_rent=hotel_rent; this.hotel_staf=hotel_staf; }
	 */

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name=hotel_name;
	}
 
	public int getHotel_rent() {
		return hotel_rent;
	}

	public void setHotel_rent(int hotel_rent) {
		this.hotel_rent = hotel_rent;
	}

	public int getHotel_items() {
		return hotel_items;
	}

	public void setHotel_items(int hotel_items) {
		this.hotel_items = hotel_items;
	}

	public int getHotel_staf() {
		return hotel_staf;
	}

	public void setHotel_staf(int hotel_staf) {
		this.hotel_staf = hotel_staf;
	}

}
