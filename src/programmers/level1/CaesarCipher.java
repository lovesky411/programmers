/**
 * 
 */
package programmers.level1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * 시저 암호
 * @author Seung-Ho Ka
 *
 */
public class CaesarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution("a B z", 4));
	}
	
	/*
	 * ASCCI
	 * 대문자 : 65~90
	 * 소문자 : 97~122 
	 */
	
	public static String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < s.length(); i++) {
        	int asc = s.charAt(i);
        	int sum = asc + n;
        	
        	if(Character.isUpperCase(s.charAt(i))) {// 대문자 일 경우
        		
        		if (sum <= 90) {
        			// 주어진 문자와 n의 합이 범위를 초과하지 않을 때
        			sb.append(Character.toString((char)sum));
        		}else {
        			// 초과하면
        			int tempCnt = 65 + (sum - 91);
        			sb.append(Character.toString((char)tempCnt));
        		}
        		
        	}else if(Character.isLowerCase(s.charAt(i))){ // 소문자 일 경우
        		
        		if (sum <= 122) {
        			// 주어진 문자와 n의 합이 범위를 초과하지 않을 때
        			sb.append(Character.toString((char)sum));
        		}else {
        			// 초과하면
        			int tempCnt = 97 + (sum - 123);
        			System.out.println(tempCnt);
        			sb.append(Character.toString((char)tempCnt));
        		}
        		
        	}else {
        		sb.append(s.charAt(i));
        	}
		}
        
        answer = sb.toString();
        
        return answer;
    }

}
