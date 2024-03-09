package code;

public class HumanClass {

	public static void checkName(Human h)
	{
		System.out.println(h.getName());
	}

	public static void birthday(Human h)
	{
		int newAge = h.getAge();
		h.setAge(++newAge);
		System.out.println(h.getAge());
	}
	
	public static void main(String[] args) {

		Human bruno = new Human();

		System.out.println( bruno.add (4,5) );
		
		System.out.println( bruno.add ("four", "five") );
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.printVariables();
		h2.printVariables();
		
		birthday(h1);
		System.out.println(h1.getAge());
	}

}
