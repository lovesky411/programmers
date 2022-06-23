/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * 문자열 다루기 기본
 * @author tmdgh
 *
 */
public class BasicCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(solution("a1234"));
		System.out.println(solution("1234"));
		System.out.println(solution("e234"));
		System.out.println(solution("123455"));

	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
        	try {
            	Integer.parseInt(s);
            }catch (NumberFormatException e) {
            	return false;
    		}	
        }else {
        	answer = false;
        }
        
        return answer;
    }

}
