package programmers.level1;

/***
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 * �űԾ��̵� ��õ
 * @author tmdgh
 *
 */
public class NewId {

	public static void main(String[] args) {
		String new_id = "\"...!@BaT#*..y.abcdefghijklm\"";
		 
		//1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		String step1 = new_id.toLowerCase();
		
		System.out.println(step1);
		
		//2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		String regex = "[a-z\\d_.-]*$";
		String step2 = step1.replaceFirst(regex, "");
		 System.out.println(step2);
		//3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		
		String step3 = step2.replaceAll("..", ".");
		 
		//4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		 
		 
		//5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		
		
		 
		//6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
	    //���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		
		
		//7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		 
		 
	}
	
	private String step2(String id) {
		String result = null;
		String regex = "^[a-z0-9-_.]";
		
		
		return result;
	}

}
