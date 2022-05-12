/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 * Â¦¼ö¿Í È¦¼ö
 * @author tmdgh
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 solution(3);
	}
	 public static String solution(int num) {
	        String answer = "";
	        if(num == 0){
	            answer = "Even";
	        }else if(num % 2 == 0){
	            answer = "Even";
	        }else {
	            answer = "Odd";
	        }
	        return answer;
	    }

}
