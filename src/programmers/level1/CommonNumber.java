/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 * 최대공약수와 최소공배수
 * @author tmdgh
 *
 */
public class CommonNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long[] answer = new long[2];
		
		int n = 2;
		int m = 5;
		
		if(n == m || m%n == 0) {
			answer[0] = n;
			answer[1] = m;
		} else {
			for(int i = 1; i <= m; i++) {
				if(n%i ==0 && m%i ==0) {
					answer[0] = i;
				}
			}
			answer[1] = n*m/answer[0];
		}
		
//		else if(n > m) {
//			int temp = n;
//			n = m;
//			m = temp;
//			answer[0] = getGCD(n, m);
//			answer[1] = getLCM(n, m);
//		}else {
//			answer[0] = getGCD(n, m);
//			answer[1] = getLCM(n, m);
//		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
	}
	
	public static int getGCD(int a, int b) {
		int r = 0;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		System.out.println(r);
		return r;
	}
	
	public static int getLCM(int a, int b) {
		return (a * b) / getGCD(a, b);
	}

}
