/**
 * 
 */
package programmers.level1;

import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 * Æò±Õ ±¸ÇÏ±â
 * @author tmdgh
 *
 */
public class AverageSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[]{5,5};
		System.out.println(solution(num));
	}
	
	public static double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }

}
