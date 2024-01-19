package firstExercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fishTemp = new Fish();
		Fish fish1 = new Fish("Amber","AngelFish", 1);
		Fish fish2 = new Fish("James","Guppy",2);
		Fish fish3 = new Fish("Bubbles","Betta",3);
		Fish fish4 = new Fish("Nemo"," Clownfish", 4);
		Fish fish5 = new Fish("Dory","Blue Tang", 5);
		Fish fish6 = new Fish("Goldie","Goldfish",2);
		Fish fish7 = new Fish("Spike", "Siamese Fighting Fish",1);
		
		System.out.println(fishTemp.nicestFish(fish1,fish2,fish3,fish4,fish5,fish6,fish7));
	}

}
