package for_;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		int coin, size, com;
        char enter;
        String result;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("동전을 넣으세요 (판당 300원) :  ");
            coin = sc.nextInt();

            for (size = coin; size >= 300; ) {
                System.out.print("숫자를 입력하세요 : [1: 주먹, 2: 가위, 3: 보]");
                int user = sc.nextInt();
                
                if (user > 3 || user < 1) {
                    System.out.println("1부터 3까지 숫자 입력 : \n");
                    continue;  
                } else {
                    com = (int) ((Math.random() * 3) + 1);
                    System.out.printf("컴퓨터: %s, 사용자: %s \t",
                            (com == 1 ? "Rock" : com == 2 ? "Scissor" : "Paper"),
                            (user == 1 ? "Rock" : user == 2 ? "Scissor" : "Paper"));
                    
                    if (com == 1) {
                        if (user == 1) {
                            result = "Draw";
                        } else if (user == 2) {
                            result = "You win";
                        } else {
                            result = "You lose";
                        }
                        System.out.println(result);
                    }
                    if (com == 2) {
                        if (user == 1) {
                            result = "You lose";
                        } else if (user == 2) {
                            result = "Draw";
                        } else {
                            result = "You win";
                        }
                        System.out.println(result);
                    }
                    if (com == 3) {
                        if (user == 1) {
                            result = "You win";
                        } else if (user == 2) {
                            result = "You lose";
                        } else {
                            result = "Draw";
                        }
                        System.out.println(result);
                    }

                }
                size -= 300;
            }
            System.out.println("gg \t 계속하려면 1, 그만하려면  아무 숫자를 입력하세요.  ");
            int input = sc.nextInt();
            
            if (input == 1) {
                continue;
            } else {
            	break;
            }
            
        }
	}
}

/*
[문제] 가위, 바위, 보 게임
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 컴퓨터(com)는 1 ~ 3까지 난수로 나온다
- 1게임당 300원으로 한다.
[실행결과]
insert coin : 1000
가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user, 사용자)
컴퓨터 : 바위   나 : 보자기
You Win!!
가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!
 */

