
public class Coffee {
	
	String name;
	String size;
	int price;
	boolean isIce;
	
	public Coffee() {
		
		size = "M";
		isIce = false;

	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isIce() {
		return isIce;
	}
	public void setIce(boolean isIce) {
		this.isIce = isIce;
	}


	@Override
	public String toString() {
		return "Coffee [name=" + name + ", size=" + size + ", price=" + price
				+ ", isIce=" + isIce + "]";
	}	
	
	
	
}


