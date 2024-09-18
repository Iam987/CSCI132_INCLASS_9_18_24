
public class DynamicArray {
	private String[] data =  new String[0];
	
	public DynamicArray() {
		
	}
	
	public void add(String newValue) {
		String[] newArray = new String[this.data.length +1];
		for(int i = 0; i < this.data.length; i++) {
			newArray[i] = this.data[i];
		}
		newArray[this.data.length] = newValue;
		this.data = newArray;
	}
	
	public void printArray() {
		String s = "";
		s += "[";
		for(int i = 0; i < data.length;i++) {
			if(i != data.length - 1) {
			s += data[i] + " ";
			}
			else {
				s += data[i];
			}
		}
		s += "]";
		System.out.println(s);
	}
	
	public int find(String searchName) {
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
	public void remove(String search) {
		String[] newArray = new String[data.length - 1];
		int insertSpot = 0;
		for(int i = 0; i < data.length; i++) {
			if(!data[i].equals(search)) {
				newArray[insertSpot] = data[i];
				insertSpot++;
			}
		}
		this.data = newArray;
	}
	public String get(int index) {
		if(index < data.length && index >= 0) {
		return data[index];
		}

		return "Please input a valid index";
	}
}

