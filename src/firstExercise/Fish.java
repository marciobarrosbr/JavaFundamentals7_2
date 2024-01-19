package firstExercise;

public class Fish {
	private String typeOfFish, name;  //Estas são variáveis de instâncias e serão definidas dentro dos	
	private int friendLiness;  //construtores de classes
	
	public Fish() {
		name = "Unknown";
		typeOfFish = "Unknown";
		friendLiness = 3;
	}//end constructor
	
	public Fish(String n,String t, int f) {
		name = n;
		typeOfFish = t;
		friendLiness = f;
	}//end constructor
	
	public int getFriendLiness() {
		return friendLiness;
	}//end method getFriendLiness
	
	public String getName() {
		return name;
	}
	
	public Fish nicestFish(Fish ... fishies) {
		Fish fishTemp = fishies[0];
		for(Fish fish: fishies) {
			if(fish.getFriendLiness()>fishTemp.getFriendLiness()) {
				fishTemp = fish;
			}//end if
		}//end for
		return fishTemp;
	}//end method nicestFish
	
	public String getGrauFriend(Fish f1) {
		int aux = f1.getFriendLiness();
		if(aux==1) return "malvado";
		if(aux==2) return "antipático";
		if(aux==3) return "neutro";
		if(aux==4) return "simpático";
		if(aux==5) return "muito Simpático";
		return "error";
			 
	}
	
	public String toString() {
		String aux=  "";
		aux += "O peixe " + getName()+" é categotizado como "+getGrauFriend(this);		
		
		return aux;
	}//end method toString
}
