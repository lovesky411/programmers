package programmers.level1;

import java.util.Scanner;

/****
 * https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 * ���簢�� �����
 * �� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
   ��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
 * @author tmdgh
 *
 */
public class RectangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
        	for (int j = 0; j < a; j++) {
        		System.out.print("*");
			}
        	System.out.println();
		}

	}

}
