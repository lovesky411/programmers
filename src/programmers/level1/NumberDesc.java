/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
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

		System.out.println(desc(118372));
	}
	
	public static long desc(long num) {
		// long -> String
		String temp = String.valueOf(num);
		
		// char 배열 생성
		char[] tempArr = new char[temp.length()];
		
		// 배열에 할당
		for (int i = 0; i < temp.length(); i++) {
			tempArr[i] = temp.charAt(i);
		}
		
		// 정렬
		Arrays.sort(tempArr);
		
		StringBuilder sb = new StringBuilder();
		
		// 내림차순 정렬 및 SB 변환
		for (int i = tempArr.length -1; i >= 0; i--) {
			sb.append(tempArr[i]);
		}
	
		return Long.parseLong(sb.toString());
	}

}
