import java.util.ArrayList;

public class Library {
	
	ArrayList<Item> libList = new ArrayList<>();
	
	public void addItem(Item item) {
		libList.add(item);
	}
	
	
	public void checkOut(Item item) {
		
		
	}
	
	
	public int listSize(Item item) {
		return libList.size();
	}
	

}
