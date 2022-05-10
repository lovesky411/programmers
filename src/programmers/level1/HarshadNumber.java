/**
 * 
 */
package programmers.level1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * �ϻ��� ��
 * @author tmdgh
 *
 */
public class HarshadNumber {


	public static void main(String[] args) {
		solution(10);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        
        //���� x�� �迭�� �ɰ���
        int[] numbers = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        //��� ���� ���ϱ�
        int sum = IntStream.of(numbers).sum();
        
        // ������������� Ȯ��
        if(Math.floorMod(x, sum) > 0) answer = false;
        
        System.out.println(answer);
        return answer;
    }

}
