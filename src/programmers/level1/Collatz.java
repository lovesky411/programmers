/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * ÄÝ¶óÃ÷ ÃßÃø
 * @author tmdgh
 *
 */
public class Collatz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		solution(1);
	}
	
	public static int solution(int num) {
        int answer = 0;
        if(num == 1) return answer;
        long one = num;
        do { 
        	one = isOne((long)one);
        	answer++;
        }while(one != 1 && answer < 500);
        if(answer >= 500 && one != 1) answer = -1;
        System.out.println(answer);
        return answer;
    }
	
	public static long isOne(long num) {
		long result = 0;
		if(num % 2 == 0) {
        	result = num / 2;
        }else {
        	result = (num *3) +1;
        }
		return result;
	}

}
