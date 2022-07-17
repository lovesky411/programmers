package programmers.level1;

/** 
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 * @author ksh
 *
 */
public class SumToFromNumber {

	public static void main(String[] args) {
		
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));

	}
	
	static long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        if(a > b) {
        	temp = a;
        	a = b;
        	b = temp;
        		
        }
        for (int i = a; i <= b; i++) {
			answer += i;
		}
        
        return answer;
    }

}
