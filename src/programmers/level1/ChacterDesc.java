/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 * 문자열 내림차순으로 배치하기
 * @author tmdgh
 *
 */
public class ChacterDesc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(solution("Zbcdefg"));
	}

	public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] ca = s.toCharArray();
        Character[] c_a = new Character[ca.length];
        for (int i = 0; i < c_a.length; i++) {
			c_a[i] = ca[i];
			
		}
        Arrays.sort(c_a, Collections.reverseOrder());
        for (Character character : c_a) {
			sb.append(character);
		}
        return sb.toString();
    }
}
