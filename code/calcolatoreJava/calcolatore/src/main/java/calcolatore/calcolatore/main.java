package calcolatore.calcolatore;

public class main {

	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        System.out.println("5 + 6 = " + c1.addizione(5, 6));
        
        System.out.println("5 * 6 = "+ c1.moltiplicazione(5,6));
        
        System.out.println("5 - 6 = "+c1.sottrazione(5,6));

	}

}
