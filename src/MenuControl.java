import java.util.Scanner;

public class MenuControl {

	
	
	public boolean insertCoffee(Coffee[] CoffeeList, String name, int price) {

		Coffee coffee = new Coffee();
		coffee.setName(name);
		coffee.setPrice(price);

		int index = searchIndex(CoffeeList);
		CoffeeList[index] = coffee;

		return true;

	}
	
	public boolean deleteCoffee(Coffee[] CoffeeList) {
		
		showCoffeeInform(CoffeeList);
		System.out.println("削除するメニューの番号を入力してください。");
		
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		sc.close();
		
		CoffeeList[index] = null;
		
		return true;
	}
	
	public boolean showCoffeeInform(Coffee[] CoffeeList) {
		
		for (int i=0; i<CoffeeList.length; i++) {
			System.out.println(CoffeeList[i]);
		}
		
		return true;
	}

	public int searchIndex(Coffee[] CoffeeList) {

		int index = 0;
		for (int i = 0; i < CoffeeList.length; i++) {

			if (CoffeeList[i] == null) {
				index = i;
				break;
			}
		}
		
		return index;
	}

}
