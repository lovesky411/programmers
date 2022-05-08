/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 * x만큼 간격이 있는 n개의 숫자
 * @author tmdgh
 *
 */
public class IntevalOfNum {

	public static void main(String[] args) {
		
		System.out.println(solution(2, 5));
	}
	
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long t = x;
        for (int i = 0; i < n; i++) {
			answer[i] = t;
			t = t+x;
		}
        return answer;
    }

}
