import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee CoffeeList[] = new Coffee[10];
		
		System.out.println("追加するメニュー情報を入力してください。");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("コーヒー名：");
		String name = sc.next();
		System.out.println("金額：");
		int price = sc.nextInt();

		sc.close();
		
		MenuControl menuControl = new MenuControl();
		menuControl.insertCoffee(CoffeeList, name, price);
		
		System.out.println(CoffeeList[0]);


	}

}
