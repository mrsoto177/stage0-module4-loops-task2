package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
    	/*int count=1;
    	
    	while(count <= chars.length) {
    		System.out.println(chars);
    		count++;
    	}
*/
    	char[] phrase = new char[chars.length];
        int i = 0;
        while (i < chars.length) {
            phrase[i] = chars[i];
            i++;
        }
        System.out.println(phrase);
    }
    	
    public static void main(String[] args) {
    	WordsBuilder builder = new WordsBuilder();
    	builder.buildPhrase('h','e','l','l','o');
    }
}
