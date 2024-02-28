package school.mjc.stage0.loops.task2;

public class Multiplication {
	public void printMultiplied(int multiplyByAndToInclusive) {
		int cont = 0;
		
		if (multiplyByAndToInclusive == 0) {
		
		}

		else if (multiplyByAndToInclusive >= 0) {
			while (cont <= multiplyByAndToInclusive * multiplyByAndToInclusive) {

				System.out.println(cont);

				cont = cont + multiplyByAndToInclusive;
			}
		} else if (multiplyByAndToInclusive < 0) {
			while (-cont <= multiplyByAndToInclusive * multiplyByAndToInclusive) {

				System.out.println(cont);

				cont = cont + multiplyByAndToInclusive;
			}
		}
	}

	public static void main(String[] args) {
		Multiplication mult = new Multiplication();
		mult.printMultiplied(0);
	}
}
