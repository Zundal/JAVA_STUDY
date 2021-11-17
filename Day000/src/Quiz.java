import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String gbb[] = new String[3];
		
		gbb[0] = "가위";
		gbb[1] = "바위";
		gbb[2] = "보";
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		char oneMore;
		do {
			int com = ((int)(Math.random() * 3 + 1));
			int user;
			do {
				System.out.println("가위 : 1, 바위 : 2, 보 : 3");
				user = scan.nextInt();
				System.out.println(gbb[user-1] + "을 내셨습니다");
				System.out.println("컴퓨터는 " + gbb[com-1] + "을 냈습니다");
				switch (user - com) {
				case 0:
					System.out.println("비겼습니다");
					draw++;
					break;
				case -2:
				case 1:
					System.out.println("이겼습니다");
					win++;
					break;
				case 2:
				case -1:
					System.out.println("졌습니다");
					lose++;
					break;
				};
				
			} while(!(user == 1 || user == 2 || user == 3));
			System.out.println("승:" + win + " 패:" + lose + " 무:" + draw);
			System.out.println("한 번 더? y/n");
			oneMore = scan.next().charAt(0);
		} while (oneMore == 'y' || oneMore == 'Y' || oneMore == 'ㅛ');
		
		scan.close();
	}
}

/*

가위,바위,보 = 1,2,3

사람 - 컴

사람\컴	가위		바위		보
가위		0		-1		-2
바위		1		0		-1
보		2		1		0

무승부		0
사람 승		-2, 1, 1
컴 승			2, -1, -1

*/