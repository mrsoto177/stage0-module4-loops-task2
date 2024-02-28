package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
    	
    	int factorial =1;
    	int cont = 1;
    	System.out.println(factorial);
    	while( cont <= printToInclusive) {
	
    		System.out.println(factorial * cont);
    		factorial *= cont;
    		 cont++;
    		
    	}
    }
    
    public static void main(String[] args) {
    	FactorialNumbers factorial = new FactorialNumbers();
    	factorial.printFactorialRow(7);
    }
    
}
