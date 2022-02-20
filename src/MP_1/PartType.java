package MP_1;

import java.util.ArrayList;

public class PartType {

	
	
	//------------------------------------
	//--------Asocjacja z atrybutem-------
	//-PartType 1 - * UsedParts * - 1 Service-
	//------------------------------------
	private String name;
	private ArrayList<UsedParts> used = new ArrayList<UsedParts>();
	
	
	public void deleteActualService(UsedParts parts) {
		used.remove(parts);
		
	}

	public void addActualService(UsedParts parts) {
		if(!this.used.contains(parts))
		this.used.add(parts);
	}
	
}
