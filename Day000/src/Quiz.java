import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String gbb[] = new String[3];
		
		gbb[0] = "����";
		gbb[1] = "����";
		gbb[2] = "��";
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		char oneMore;
		do {
			int com = ((int)(Math.random() * 3 + 1));
			int user;
			do {
				System.out.println("���� : 1, ���� : 2, �� : 3");
				user = scan.nextInt();
				System.out.println(gbb[user-1] + "�� ���̽��ϴ�");
				System.out.println("��ǻ�ʹ� " + gbb[com-1] + "�� �½��ϴ�");
				switch (user - com) {
				case 0:
					System.out.println("�����ϴ�");
					draw++;
					break;
				case -2:
				case 1:
					System.out.println("�̰���ϴ�");
					win++;
					break;
				case 2:
				case -1:
					System.out.println("�����ϴ�");
					lose++;
					break;
				};
				
			} while(!(user == 1 || user == 2 || user == 3));
			System.out.println("��:" + win + " ��:" + lose + " ��:" + draw);
			System.out.println("�� �� ��? y/n");
			oneMore = scan.next().charAt(0);
		} while (oneMore == 'y' || oneMore == 'Y' || oneMore == '��');
		
		scan.close();
	}
}

/*

����,����,�� = 1,2,3

��� - ��

���\��	����		����		��
����		0		-1		-2
����		1		0		-1
��		2		1		0

���º�		0
��� ��		-2, 1, 1
�� ��			2, -1, -1

*/