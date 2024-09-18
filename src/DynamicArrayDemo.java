
public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();
		array.add("First");
		array.add("Second");
		array.add("Third");
		array.printArray();

		array.add("Fourth");
		array.add("Fifth");
		array.add("Sixth");
		array.remove("Third");
		array.printArray();
		
		System.out.println(array.find("Third"));
		System.out.println(array.get(4));
		System.out.println(array.get(60));
		System.out.println(array.get(-4));

	}

}
