/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 * 수박수박수박수박수?
 * @author Seung-Ho Ka
 *
 */
public class WaterMelon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		solution(5);
	}
	
	public static String solution(int n) {
        String answer = "";
        String s = "수";
        String b = "박";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
			if(i == 0 || i%2 == 0) {
				sb.append(s);
			}else {
				sb.append(b);
			}
		}
        
        answer = sb.toString();
        
        
        return answer;
    }

}
