package factorypattern;

public class PetFactoryExample {

  public static void main(String[] args) {
	  PetFactory factory=new PetFactory();
	  Pet pet=factory.getPet("Quck Quck..");
	  System.out.println(pet.petSound());		  
  }
}
