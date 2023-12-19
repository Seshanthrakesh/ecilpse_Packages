package chat;

public class ReverseNumber {
	public static void main(String[] args) {
int number=12345;
int reservednumber=reverse(number);
System.out.println(number);
System.out.println(reservednumber);
	}
public static int reverse(int num) {
	int reversednum=0;
	while(num !=0) {
		int digit =num %10;
		reversednum=reversednum*10+digit;
		num/=10;
	}
	return reversednum;
}
}
