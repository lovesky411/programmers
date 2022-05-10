/**
 * 
 */
package programmers.level1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * 하샤드 수
 * @author tmdgh
 *
 */
public class HarshadNumber {


	public static void main(String[] args) {
		solution(10);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        
        //받은 x를 배열로 쪼개기
        int[] numbers = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        //모든 정수 더하기
        int sum = IntStream.of(numbers).sum();
        
        // 나누어떨어지는지 확인
        if(Math.floorMod(x, sum) > 0) answer = false;
        
        System.out.println(answer);
        return answer;
    }

}
