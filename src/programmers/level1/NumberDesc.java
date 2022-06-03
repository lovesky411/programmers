/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * 정수 내림차순으로 배치하기 118372
 * @author Seung-Ho Ka
 *
 */
public class NumberDesc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		desc(118372);
	}
	
	public static int desc(int num) {
		int result = 0;
		String temp = Integer.toString(num);
		Integer[] tempArr = new Integer[temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
			tempArr[i] = temp.charAt(i) - '0';
		}
		Arrays.sort(tempArr, Collections.reverseOrder());
		
		
		
		return result;
	}

}
