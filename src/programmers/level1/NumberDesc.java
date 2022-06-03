/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * ���� ������������ ��ġ�ϱ� 118372
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
		
		// char �迭 ����
		char[] tempArr = new char[temp.length()];
		
		// �迭�� �Ҵ�
		for (int i = 0; i < temp.length(); i++) {
			tempArr[i] = temp.charAt(i);
		}
		
		// ����
		Arrays.sort(tempArr);
		
		StringBuilder sb = new StringBuilder();
		
		// �������� ���� �� SB ��ȯ
		for (int i = tempArr.length -1; i >= 0; i--) {
			sb.append(tempArr[i]);
		}
	
		return Long.parseLong(sb.toString());
	}

}
