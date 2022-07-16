package programmers.level1;

/**
 * 문자열 내 p와 y의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
 * @author ksh
 *
 */
public class PYInWord {

	public static void main(String[] args) {
		
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));

	}
	
	static boolean solution(String s) {
	    
	    int pCnt = 0;
	    int yCnt = 0;
	    
	    char[] cArr = (s.toLowerCase()).toCharArray();
	    
	    for (char c : cArr) {
	    	if(c == 'p') {
	    		pCnt++;
	    	}
	    	if(c == 'y') {
	    		yCnt++;
	    	}
		}
	    
	    if(pCnt == yCnt) {
	    	return true;
	    }else {
	    	return false;
	    }
	    
	}

}
