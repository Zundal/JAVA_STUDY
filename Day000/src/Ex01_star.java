import java.util.Scanner;

class Star{
	
	// ������
	Star(){
		System.out.println("���°�ٱ��� ���ʴ�� ���� ����ϰ� �ͽ��ϱ�?");
	}
	
	public int sum() {
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		return str;
	}
	
}

public class Ex01_star {

	public static void main(String[] args) {
		
		Star star = new Star();
		int strr = star.sum();
		
		for(int i = 0; i < strr; i++) {
			System.out.print('*');
			
			for(int y = 1; y <= i; y++) {
				System.out.print('*');
			}
			System.out.println(' ');
		}

	}

}
