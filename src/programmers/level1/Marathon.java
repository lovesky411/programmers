package programmers.level1;

import java.util.Arrays;

/***
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 완주하지 못한 선수
 * @author tmdgh
 *
 */
public class Marathon {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		solution(participant, completion);
		
	}
	
   public static String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i = 0; i < participant.length -1; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
            
        }
        return participant[i];
    }

}
