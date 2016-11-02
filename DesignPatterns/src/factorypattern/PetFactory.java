package factorypattern;

public class PetFactory {

	public Pet getPet(String petType) {
		if(petType.equals("Bow Bow.."))
			return new Dog();
		else if(petType.equals("Mewo Mewo.."))
			return new Cat();
		else
			return new Duck();
	}
}
