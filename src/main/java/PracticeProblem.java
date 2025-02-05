import java.util.Scanner;

public class PracticeProblem{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1(){
		sc = new Scanner(System.in);
		System.setIn(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextLine());
	}

	public static void q2(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("In: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}

	public static void q3(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextLine() + " was the text you wrote");
	}

	public static void q4(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextInt() * 5);
		sc.nextLine();
	}

	public static void q5(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextBoolean() + " is a boolean");
		if(sc.hasNextLine()) sc.nextLine();
	}

	public static void q6(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextDouble() - 3.2);
		if(sc.hasNextLine()) sc.nextLine();
	}
}
