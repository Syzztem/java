public class Hangar
{
	public static void main(String... args)
	{
		Car clio = new Car("Clio", 26);
		Boat titanic = new Boat("Titanic", 4500);
		System.out.println(clio.doStuff());
		System.out.println(titanic.doStuff());
	}
}
