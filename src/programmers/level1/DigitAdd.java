/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * 자릿수 더하기
 * @author Seung-Ho Ka
 *
 */
public class DigitAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution(456));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        //int -> String
        String temp = Integer.toString(n);
        
        for (int i = 0; i < temp.length(); i++) {
			int c = Character.getNumericValue(temp.charAt(i));
			answer = answer + c;
		}

        return answer;
    }

}
