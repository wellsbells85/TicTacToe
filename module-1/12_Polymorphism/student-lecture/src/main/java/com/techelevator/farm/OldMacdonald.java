package com.techelevator.farm;

public class OldMacdonald {
	
	public static void main(String[] args) {
		
		Cow cow = new Cow();
		Chicken chick = new Chicken();
		
		chick.layEgg();

		FarmAnimal[] farmAnimals = new FarmAnimal[] { cow, chick };

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
	}
}