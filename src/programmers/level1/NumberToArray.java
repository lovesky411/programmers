/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 * 자연수 뒤집어 배열로 만들기
 * @author Seung-Ho Ka
 *
 */
public class NumberToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
	
	public static int[] solution(long n) {
        
        // Long -> String
        String temp = Long.toString(n);
        
        int[] answer = new int[temp.length()];
        
        int j = 0;
        // 배열 할당
        for(int i = temp.length()-1; i >= 0; i--) {
        	answer[j] = Character.getNumericValue(temp.charAt(i));
        	j++;
        }
        
        return answer;
    }

}
