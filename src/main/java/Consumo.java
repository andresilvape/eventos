
public class Consumo {

	public static  double x;
	public  static double y;
	
	public Consumo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		Consumo.x = x;
	}

	public double gasto() {
		double resp = Consumo.x / Consumo.y;		
		return resp;
	}
	public double getValor(double y) {
	return y = gasto();
	}
	
	public String toString() { return "Consumo :%.3f" + gasto()+ "km/l"; }
	 
	public static void main(String[] args) {

		Consumo c = new Consumo(500.00, 34.00);

		System.out.printf("%.3f", c.getValor(y) );
		System.out.println();
		System.out.println(c.gasto());
	}
}
