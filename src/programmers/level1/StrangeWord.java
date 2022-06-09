/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Iterator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * 이상한 문자 만들기
 * @author Seung-Ho Ka
 *
 */
public class StrangeWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(solution("try   hello  world"));
	}
	
	public static String solution(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
			if(" ".equals(Character.toString(s.charAt(i)))){
				// 공백이면 n 초기화& skip
				n = 0;
				sb.append(s.charAt(i));
				continue;
			}else {
				if(n == 0 || n%2 == 0) {
					// 짝수이거나 0일경우
					sb.append(Character.toString(s.charAt(i)).toUpperCase());
				}else {
					// 홀수일경우
					sb.append(Character.toString(s.charAt(i)).toLowerCase());
				}
				n++;
			}
		}
        
        answer = sb.toString();
        
        
        
        return answer;
    }

}
