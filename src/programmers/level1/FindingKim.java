/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12919?language=java
 * 서울에서 김서방 찾기
 * @author tmdgh
 *
 */
public class FindingKim {

	public static void main(String[] args) {

		String[] arr = {"Jane", "Kim"};
		System.out.println(solution(arr));
	}
	
	
    public static String solution(String[] seoul) {
        int j = 0;
        for (int i = 0; i < seoul.length; i++) {
			String string = seoul[i];
			if("Kim".equals(string)) {
				j = i;
				break;
			}
		}
        return "김서방은 " + j+"에 있다";
    }

}
