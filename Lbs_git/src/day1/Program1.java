package day1;

public class Program1 {
public static void main(String[] args) {
	int num=16;
	boolean isPerfect=false;
	for(int i=1;i<=num/2;i++) {
		if(i*i==num) {
			isPerfect=true;
			break;
		}
	}
	if (isPerfect) {
		System.out.println("Yes it is perfect no");
	} else {
System.out.println("It is not perfect no");
	}
}
}
