/**
 * 
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * ���� ������������ ��ġ�ϱ�
 * @author tmdgh
 *
 */
public class NumberDescending {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		solution(118372);
	}
	
	public static long solution(long n) {
        long answer = 0;
        
//        String[] nArr = ;
        
        String sb  = Arrays.asList(Long.toString(n).split(""))
						.stream()
						.sorted(Comparator.reverseOrder())
						.toString();
						
//						.toArray(StringBuffer::new);
        
        System.out.println(sb);
						
//						.flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
//						.forEach(s -> sb.append(s))
						
        
        
        System.out.println();
        return answer;
    }

}
