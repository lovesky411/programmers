package programmers.level1;

/***
 * https://programmers.co.kr/learn/courses/30/lessons/12948 
 * 핸드폰 번호 가리기
 * @author tmdgh
 *
 */
public class PhoneNumberEncrypt {

	public static void main(String[] args) {

		solution("01033334444");

	}

	public static String solution(String phone_number) {
		String answer = "";
		char[] cArr = phone_number.toCharArray();
		for (int i = 0; i < cArr.length - 4; i++) {
			cArr[i] = '*';
		}
		answer = String.valueOf(cArr);
		return answer;
	}

}
