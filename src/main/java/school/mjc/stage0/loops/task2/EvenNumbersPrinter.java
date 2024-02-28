package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
    	
    	int cont = 0;
    	
		   while(cont <= printTillInclusive ) {
			   
			   if (cont % 2 ==0) {
				   System.out.println(cont);				  
			   }
			   cont ++;
		   }
    }
    
    public static void main(String[] args) {
    	EvenNumbersPrinter printer = new EvenNumbersPrinter();
    	printer.printEvenNumbers(0);
    }
}
