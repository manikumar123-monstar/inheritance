package mani;

public class Vip extends Tiket {
	

	public static void main(String[] args) {
		Vip v=new Vip();
		
		System.out.println("total_value "+v.total_value(10,50));
		System.out.println("tiket_nuber "+v.tiket_numer);
		System.out.println("tiket_cost "+v.tiket_cost);
		// TODO Auto-generated method stub

	}

	@Override
	int total_value(int number, int cost) {
		// TODO Auto-generated method stub
		return number+cost;
	}

}
