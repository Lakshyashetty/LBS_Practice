package day2;

public class Program2 {
public static void main(String[] args) {
	int num=2;
	for (int i = 1; i <= 10; i++) {
		if (i%2==0) {
			num=num+i;
		}
	}
	System.out.println("Sum of Even Number between 2 to 10 is:"+num);
}
}
