import java.util.Scanner;

public class FirstHomework {
	public static void main(String[] args) {
        inOrNot(5, 5);
	}
	public static void PrintThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	public static void CheckSumSign() {
		int a = 69;
		int b = 420;
		String c = (a + b >= 0)? "Sum is positive" : "Sum is negative";
		System.out.println(c);
	}
	//Тут я захотел сделать что-нибудь интересное, поднабравшись опыта из материалов, которые вы скинули ^_^. Спасибо, кстати!). 
	public static void PrintColour() {
		Scanner sc = new Scanner(System.in);
		do {
		int value = 0;
		System.out.println ("Fill any number:");
		value = sc.nextInt();
		if (value < 0) {
			System.out.println("Red");
		}
		if (value > 0 && value < 100) {
			System.out.println("Yellow");
		}
		if (value > 100) {
			System.out.println("Green");
		}
			System.out.println("Repeat? Press 1");
		} while (sc.nextInt() == 1);
	}
	public static void CompareNumbers() {
		int a = 20;
		int b = 15;
		String c = (a >= b)? "a >= b" : "a < b";
		System.out.println(c);
	}
    static boolean inOrNot (int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }
}
	

