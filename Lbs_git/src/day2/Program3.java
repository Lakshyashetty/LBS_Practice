package day2;

public class Program3 {
public static void main(String[] args) {
	int num=1000;
	int years=num/365;
	int weeks=(num%365)/7;
	int days=(num%365)%7;
	System.out.println(years+" "+weeks+" "+days);
}
}
