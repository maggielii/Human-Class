package code;

public class Human {

	private String name;
	private int age;
	private boolean healthy;
	
	public Human()
	{
		age = 0;
		healthy = true;
	}

	public Human(int age)
	{
		this.age = age;
		healthy = true;
	}
	
	public Human(int age, boolean healthy)
	{
		this.age = age;
		this.healthy = healthy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if(age > 30)
		{
			int random = (int)(Math.random()*(100));
			if(random < 21)
			{
				return -5;
			}
			else 
			{
				return age;
			}
		}
		else
			return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHealthy() {
		return healthy;
	}

	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	
	public int add(int number1, int number2)
	{
		return number1 + number2;
	}
	
	public int add(String stringNumber1, String stringNumber2)
	{
		int number1 = 0, number2 = 0;
		if(stringNumber1.equals("one"))
			number1 = 1;
		else if(stringNumber1.equals("two"))
			number1 = 2;
		else if(stringNumber1.equals("three"))
			number1 = 3;
		else if(stringNumber1.equals("four"))
			number1 = 4;
		else if(stringNumber1.equals("five"))
			number1 = 5;
		else if(stringNumber1.equals("six"))
			number1 = 6;
		else if(stringNumber1.equals("seven"))
			number1 = 7;
		else if(stringNumber1.equals("eight"))
			number1 = 8;
		else if(stringNumber1.equals("nine"))
			number1 = 9;
		else 
		{
			System.out.println("Error");
			return -1;
		}
		
		if(stringNumber2.equals("one"))
			number2 = 1;
		else if(stringNumber2.equals("two"))
			number2 = 2;
		else if(stringNumber2.equals("three"))
			number2 = 3;
		else if(stringNumber2.equals("four"))
			number2 = 4;
		else if(stringNumber2.equals("five"))
			number2 = 5;
		else if(stringNumber2.equals("six"))
			number2 = 6;
		else if(stringNumber2.equals("seven"))
			number2 = 7;
		else if(stringNumber2.equals("eight"))
			number2 = 8;
		else if(stringNumber2.equals("nine"))
			number2 = 9;
		else 
		{
			System.out.println("Error");
			return -1;
		}
		
		return number1 + number2;
	}
	
	public void printVariables()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Healthy: " + healthy);
	}
	
}
