public class SecondHomework {
    public static void main (String[] args) {
       System.out.println (inOrNot(6, 6));
       System.out.println (positiveOrNegative (5));
       System.out.println (reversePositiveOrNegative (-4));
       printWord("something", 4);
       System.out.println (identifyAYear(400));
    }
    
    static boolean inOrNot (int a, int b) {
        System.out.println ("1-st task");
        return (a + b >= 10) && (a + b <= 20);
    }
    
    static String positiveOrNegative (int a) {
        System.out.println ("2-nd task");
        return a>=0 ? "Positive" : "Negative";
    }
    
    static boolean reversePositiveOrNegative (int a) {
        System.out.println ("3-rd task");
        return (a<0);
    }
    static void printWord(String word, int a) {
        System.out.println ("4-th task");
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }
    static boolean identifyAYear(int year) {
        System.out.println("5-th task");
        return (year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0);
        
    }
}
        
        
        
	