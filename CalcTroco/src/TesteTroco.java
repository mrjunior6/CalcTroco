import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;

public class TesteTroco {
	static double num;

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		num = sc.nextDouble();

	//	int inteiro = (int) num;

		Calc calcInt = new Calc();
		calcInt.Calculo(num);
		

		for (Object key : calcInt.getMapTroco().keySet()) {


			Object value = calcInt.getMapTroco().get(key);
			System.out.println(key + " = " + value);
		}


	}
}