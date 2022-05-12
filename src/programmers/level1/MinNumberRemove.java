/**
 * 
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12935 
 * 제일 작은 수 제거하기
 * @author tmdgh
 *
 */
public class MinNumberRemove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10};
		solution(arr);

	}

	public static int[] solution(int[] arr) {
		
		System.out.println(arr.length);
		
		if(arr.length <= 1){
			System.out.println("dd");
			int[] answer = new int[1];
			answer[0] = -1;
          return answer;
        } 
		
		int[] answer = new int[arr.length -1];
		
		answer = IntStream.of(arr).sorted().toArray();
		
		Integer min = IntStream.of(arr).min().getAsInt();
		
		ArrayList<Integer> intArr = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		intArr.remove(min);
		answer = intArr.stream().mapToInt(i -> i).toArray();
		System.out.println(intArr);
		
		
		System.out.println(IntStream.of(arr).min().getAsInt());
		
//		int[] a = IntStream.of(arr).filter(e -> IntStream.of(arr).min().getAsInt()).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

}
