import java.util.Scanner;
    public class RunAnimal{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String input = s.nextLine();
		
		if(input.equalsIgnoreCase("B")){
			Bird bird = new Bird();
			bird.eat();
			bird.sleep();
			bird.makesound();
			
			
		}else if (input.equalsIgnoreCase("C")){
			System.out.println("Cat");
			Cat cat = new Cat();
			cat.eat();
			cat.sleep();
			cat.makesound();
			
		}else if (input.equalsIgnoreCase("D")){
			System.out.println("Dog");
			Dog dog = new Dog();
			dog.eat();
			dog.sleep();
			dog.makesound();
			
		}
			
			
		
	}
	
}