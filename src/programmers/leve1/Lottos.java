package programmers.leve1;

import java.util.Arrays;
import java.util.stream.IntStream;

/****
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 * @author tmdgh
 *
 */
public class Lottos {

	public static void main(String[] args) {
//		int[] answer = {};
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int zeroSize = 0;
		int winCnt = 0;
		
//		zeroSize = (int) IntStream.range(0, lottos.length).filter(i -> i == 0).count();
		
		for(int i = 0; i < lottos.length; i++) {
			if( lottos[i] == 0) zeroSize++;
			int num = lottos[i];
			for(int j = 0; j < win_nums.length; j++) {
				if(win_nums[j] == lottos[i]) {
					winCnt++;
					System.out.println(win_nums[j]);
					System.out.println(lottos[i]);
				}
			}
//			if(Arrays.stream(win_nums).anyMatch(j -> j == num)) ++winCnt;
		}
		
		int[] answer = {winCnt, winCnt+zeroSize};
		System.out.println(answer);

	}
	
	public int getPrizeNum(int size) {
		int prize = 0;
		switch (size) {
		case 2: {
			prize = 5;
			break;
		}
		case 3: {
			prize = 4;
			break;
		}
		case 4: {
			prize = 3;
			break;
		}
		case 5: {
			prize = 2;
			break;
		}
		case 6: {
			prize = 1;
			break;
		}
		default:
			prize = 6;
			break;
		}

		return prize;
	}

}
