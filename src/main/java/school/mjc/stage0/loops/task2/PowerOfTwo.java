package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
    	int count = 2;
    	
    	if(power <0) {
    		System.out.println("too much power");
    	}
    	
    	else if( power >= 0) {
    		System.out.println(1);
    		while (count <= power * power) {
    			
    			System.out.println(count);
    			
    			count=count*2;
        	}
    	}
    	

    }
    
    public static void main(String[] args) {
    	PowerOfTwo power = new PowerOfTwo();
    	power.printPower(0);
    }
}
