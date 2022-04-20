package programmers.level1;

/***
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 * 신규아이디 추천
 * @author tmdgh
 *
 */
public class NewId {

	public static void main(String[] args) {
		String new_id = "\"...!@BaT#*..y.abcdefghijklm\"";
		 
		//step1
		String step1 = new_id.toLowerCase();
		
		System.out.println(step1);
		
		//step2
		String regex = "[a-z\\d_.-]*$";
		String step2 = step1.replaceFirst(regex, "");
		 System.out.println(step2);
		//step3
		
		//step
		 
		//step
		 
		//step
		 
		 
	}
	
	private String step2(String id) {
		String result = null;
		String regex = "^[a-z0-9-_.]";
		
		
		return result;
	}

}
