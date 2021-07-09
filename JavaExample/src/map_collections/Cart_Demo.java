package map_collections;

import java.util.HashMap;
import java.util.Map;

public class Cart_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,ItemDefination>itemDef=new HashMap<Integer,ItemDefination>();
		itemDef.put(1, new ItemDefination("apple",35.5f));
		itemDef.put(2, new ItemDefination("orange",32.5f)); 
		//lets add the items to the cart
		
		Map<Integer,Integer> cart=new HashMap<Integer,Integer>();
		cart.put(1, 10);
		cart.put(2, 20);
		
		//checkout 
		Chkout_Cart ck=new Chkout_Cart();
		System.out.println("Total cost to be paid "+ck.chkOut(itemDef, cart));

	}

}
class Chkout_Cart{ 
	int totCost=0;
	int chkOut(Map<Integer,ItemDefination> itemDef,Map<Integer,Integer> cart) {
		//retrive all the key/values from the cart
		for(Map.Entry<Integer, Integer> crt :cart.entrySet()) {
			//get the key from the crt and retrive the object associate with itemDef
			ItemDefination item=itemDef.get(crt.getKey());
			//get values from the crt and multiply with the unit cost assiciate with the above object
			totCost+=(crt.getValue())*(item.unitCost);
		System.out.println(crt.getValue()+"getvalu");
		System.out.println((item.unitCost)+"unitcost");
		
		}
		return totCost;
		
	}
}


//user that can take item discription and unit cost
class ItemDefination{
	String itemDesc;
	float unitCost;
	public ItemDefination(String itemDesc, float unitCost) {
		super();
		this.itemDesc = itemDesc;
		this.unitCost = unitCost;
	}
	@Override
	public String toString() {
		return "ItemDefination [itemDesc=" + itemDesc + ", unitCost=" + unitCost + "]";
	}
	
}
