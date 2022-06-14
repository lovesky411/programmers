/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 * 문자열을 정수로 바꾸기
 * @author Seung-Ho Ka
 *
 */
public class WordToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution("-1234"));
	}
	
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

}

