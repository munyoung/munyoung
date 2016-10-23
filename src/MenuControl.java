public class MenuControl {

	public boolean insertCoffee(Coffee[] CoffeeList, String name, int price) {

		Coffee coffee = new Coffee();
		coffee.setName(name);
		coffee.setPrice(price);

		int index = searchIndex(CoffeeList);
		CoffeeList[index] = coffee;

		System.out.println(CoffeeList[index]);

		return true;

	}

	public boolean deleteCoffee(Coffee[] CoffeeList, int index) {

		CoffeeList[index] = null;

		for (int i = index; i < CoffeeList.length; i++) {

			if (i < CoffeeList.length - 1) {
				CoffeeList[i] = CoffeeList[i + 1];
			}

			else {
				CoffeeList[i] = null;
			}
		}

		return true;
	}

	public boolean updateCoffeePrice(Coffee[] CoffeeList, int index, int price) {

		CoffeeList[index].price = price;
		return true;
	}

	public boolean showCoffeeInform(Coffee[] CoffeeList) {

		for (int i = 0; i < CoffeeList.length; i++) {
			System.out.println(i + ":" + CoffeeList[i]);
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

	public boolean insertInform(Coffee[] CoffeeList) {

		for (int i = 0; i < CoffeeList.length; i++) {
			
			Coffee coffee = new Coffee();
			coffee.setName("COFFEE" + (i+1));
			coffee.setPrice((i+1) * 100);
			coffee.setSize("M");
			coffee.setIce(false);
			
			CoffeeList[i] = coffee;
			
		}

			return true;
	}

}
