import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MenuControl menuControl = new MenuControl();
		Coffee CoffeeList[] = new Coffee[10];

		while (true) {

			int menu = 0;
			System.out.println("*****メニュー*****");
			System.out.println("1. メニュー閲覧");
			System.out.println("2. メニュー追加");
			System.out.println("3. メニュー削除");
			System.out.println("4. 金額修正");
			System.out.println("9. 終了");

			menu = sc.nextInt();

			switch (menu) {

			case 1: {

				menuControl.showCoffeeInform(CoffeeList);

				break;
			}

			case 2: {

				System.out.println("追加するメニュー情報を入力してください。");

				System.out.println("コーヒー名：");
				String name = sc.next();
				System.out.println("金額：");
				int price = sc.nextInt();

				menuControl.insertCoffee(CoffeeList, name, price);

				break;
			}

			case 3 : {

				menuControl.showCoffeeInform(CoffeeList);
				System.out.println("削除するメニューの番号を入力してください。");

				int index = sc.nextInt();
				menuControl.deleteCoffee(CoffeeList, index);

				break;
			}
			
			case 4 : {
				menuControl.showCoffeeInform(CoffeeList);
				System.out.println("修正するメニューの番号を入力してください。");
				int index = sc.nextInt();
				System.out.println("新しい" + CoffeeList[index] + "の金額を入力してください。");
				int price = sc.nextInt();
				menuControl.updateCoffeePrice(CoffeeList, index, price);
				break;	
			}
			
			case 0 : {
				menuControl.insertInform(CoffeeList);
				break;
			}
			case 9 : {
				break;
			}
			}
			
			if( menu == 9) {
				System.out.println("終了します！");
				break;
			}
		}

	}

}
