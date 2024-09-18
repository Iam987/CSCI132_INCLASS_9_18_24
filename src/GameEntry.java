
public class GameEntry implements Comparable<GameEntry>{

	private int score;
	private String name;
	
	public GameEntry(int s, String n) {
		this.score = s;
		this.name = n;
	}
	
	public void printEntry() {
		System.out.println(this.name + "-----" + this.score);
	}
	@Override
	public int compareTo(GameEntry other) {
		if(this.score > other.score) {
			return -1;
		}
		else if(this.score < other.score) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public String getName() {
		return this.name;
	}
	
}
