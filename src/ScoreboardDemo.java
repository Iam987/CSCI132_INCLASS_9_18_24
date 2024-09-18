
public class ScoreboardDemo {

	public static void main(String[] args) {

		Scoreboard scoreboard = new Scoreboard("Pac-man");
		
		scoreboard.addScore("Jack",5000);
		scoreboard.addScore("Reese",75);
		scoreboard.addScore("Sally",9150);
		scoreboard.addScore("Bob",4000);
		scoreboard.addScore("asdf",2000);
		scoreboard.addScore("iam",44300);
		scoreboard.addScore("ina",420);
		scoreboard.addScore("Ian",1300);
		
		scoreboard.printSB();
		
		scoreboard.removeScore("Bob");
		
		//scoreboard.printSB();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		scoreboard.topFive();

	}

}
