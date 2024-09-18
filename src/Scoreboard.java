import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

	private String name; //pacman,dig dug, ...
	private ArrayList<GameEntry> scores;
	
	public Scoreboard(String n) {
		this.name = n;
		this.scores = new ArrayList<>();
	}
	
	public void addScore(String n, int s) {
		GameEntry g = new GameEntry(s,n);
		scores.add(g);
		Collections.sort(scores);
	}

	public void printSB() {
		for(GameEntry g : scores) {
			g.printEntry();
		}
		
	}

	public void removeScore(String n) {
		for(int i = 0; i < scores.size(); i++) {
			String name = scores.get(i).getName();
			if(name.equals(n)) {
				scores.remove(i);
				break;
			}
		}
		
	}

	public void topFive() {
		for(int i = 0; i < 5; i++) {
			scores.get(i).printEntry();
		}
		
	}
	
}
