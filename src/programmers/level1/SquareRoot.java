/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 * 정수 제곱근 판별
 * @author tmdgh
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(3));
	}
	
	public static long solution(long n) {
	        long answer = 0;
	        double sqrt = Math.sqrt(n);
	        System.out.println(sqrt);
	        
	        if(sqrt == Math.rint(sqrt)) {
	        	double pow =  sqrt+1.0;
	        	answer = (long) (pow * pow);
	        }else {
	        	answer = -1;
	        }
	        return answer;
	}

}
