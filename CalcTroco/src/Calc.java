import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Calc {

	int inteiroResto;
	Map<String, Number> mapTroco = new LinkedHashMap<String, Number>();

	public Map<String, Number> getMapTroco() {
		return mapTroco;
	}

	public Map<String, Number> Calculo(double num) {

		int inteiro = (int) num;
		double decimal = num - (int) num;
		
		String tmp = new DecimalFormat("0.00").format(decimal);
		
		decimal = Double.parseDouble(tmp);

		while (inteiro >= 1) {

			if (inteiro >= 100) {
				int x = inteiro / 100;
				inteiroResto = inteiro % 100;
				inteiro -= (100 * x);
				mapTroco.put("Notas de R$100, quantidade", x);
				// System.out.println("Notas de R$100, quantidade: " + x);
			}

			if (inteiro >= 50) {
				int x = inteiro / 50;
				inteiro -= (50 * x);
				mapTroco.put("Notas de R$50, quantidade", x);
				// System.out.println("Notas de R$50, quantidade: " + x);
			}

			if (inteiro >= 20) {
				int x = inteiro / 20;
				inteiro -= (20 * x);
				mapTroco.put("Notas de R$20, quantidade", x);
				// System.out.println("Notas de R$20, quantidade: " + x);
			}

			if (inteiro >= 10) {
				int x = inteiro / 10;
				inteiroResto = inteiro % 10;
				inteiro -= (10 * x);
				mapTroco.put("Notas de R$10, quantidade", x);
				// System.out.println("Notas de R$10, quantidade: " + x);
			}

			if (inteiro >= 5) {
				int x = inteiro / 5;

				inteiro -= (5 * x);
				mapTroco.put("Notas de R$5, quantidade", x);
				// System.out.println("Notas de R$5, quantidade: " + x);
			}

			if (inteiro < 5 && inteiro >= 1) {
				int x = inteiro / 1;
				inteiroResto = inteiro % 1;
				inteiro -= (1 * x);
				mapTroco.put("Moedas de R$1, quantidade", x);
				// System.out.println("Moedas de R$1, quantidade: " + x);
			}

			while (decimal >= 0.01) {

				if (decimal >= 0.50) {
					double x = decimal / 0.50;
					decimal -= (0.50 * x);
					mapTroco.put("Moedas de R$0.50, quantidade", x);
				}

				if (decimal >= 0.25) {
					double x = decimal / 0.25;
					decimal -= (0.25 * x);
					mapTroco.put("Moedas de R$0.25, quantidade", x);
				}

				if (decimal >= 0.10) {
					double x = decimal / 0.10;
					decimal -= (0.10 * x);
					mapTroco.put("Moedas de R$0.10, quantidade", x);
				}

				if (decimal >= 0.05) {
					double x = decimal / 0.05;
					decimal -= (0.05 * x);
					mapTroco.put("Moedas de R$0.05, quantidade", x);
				}

				if (inteiro < 0.05 && inteiro >= 0.01) {
					double x = decimal / 0.01;
					decimal -= (0.01 * x);
					mapTroco.put("Moedas de R$0.01, quantidade", x);
				}

			}
			
		}
		return mapTroco;

	}
}