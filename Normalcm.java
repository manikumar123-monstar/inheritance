package mani;

public class Normalcm extends Tiket{

	public static void main(String[] args) {
		Normalcm n=new Normalcm();
		System.out.println("total_value "+n.total_value(4,30));
		// TODO Auto-generated method stub

	}

	@Override
	int total_value(int number, int cost) {                           
		// TODO Auto-generated method stub
		return 80;
		
	}

}
