package Exception;

public class Comparable1 implements Comparable<Comparable1>{
	
	String lap_name;
	int lap_ram;
	int generation;
	int cost;
	
	public static void main(String[] args) {
		

	}

	
	public String getLap_name() {
		return lap_name;
	}


	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}


	public int getLap_ram() {
		return lap_ram;
	}


	public void setLap_ram(int lap_ram) {
		this.lap_ram = lap_ram;
	}


	public int getGeneration() {
		return generation;
	}


	public void setGeneration(int generation) {
		this.generation = generation;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public Comparable1(String lap_name, int lap_ram, int generation, int cost) {
		super();
		this.lap_name = lap_name;
		this.lap_ram = lap_ram;
		this.generation = generation;
		this.cost = cost;
	}


	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return this.lap_name.compareTo(o.lap_name);
	}


	@Override
	public String toString() {
		return "Comparable1 [lap_name=" + lap_name + ", lap_ram=" + lap_ram + ", generation=" + generation + ", cost="
				+ cost + "]";
	}

}
