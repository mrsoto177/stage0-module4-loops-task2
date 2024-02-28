package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
    	
    	int cont = 0;
    	
		   while(cont < lastPrinted + 1 ) {
			   System.out.println(cont);
			   cont ++;
		   }
    }
    
    public static void main(String[] args) {
    	NaturalNumbers repeat = new NaturalNumbers();
    	repeat.naturalNumbersPrinter(20);
    }
}
