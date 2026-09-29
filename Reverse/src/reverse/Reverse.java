package reverse;

public class Reverse {

	public static void main(String args[]) {
	//	int x=1534236469;
		System.out.println(isPalindrome(121));
		

}
public static boolean isPalindrome(int num) {
	int reverse=0;
	int digit=0;
	int x=num;
	while(x!=0) {
		digit=x%10;
		reverse=reverse*10+digit;
		x=x/10;
	}

	if (reverse==num) {
		return true;
			
	}
	else {
		return false;
	}
}
}
