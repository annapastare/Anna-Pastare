package lv.anna.test;

import lv.anna.module.League;
import lv.anna.module.Team;

public class TestTeamAndLeague {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Team> khlTeam = new ArrayList<>();
		
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		Team dinamo = new Team("DINAMO");
		Team spartak = new Team("SPARTAK");
		Team torpedo = new Team("TORPEDO");
		Team jokerit = new Team("JOKERIT");
		
		System.out.println("Team total point: "+ska.totalPoint());
		
		khlTeam.add(ska);
		khlTeam.add(cska);
		khlTeam.add(dinamo);
		khlTeam.add(spartak);
		khlTeam.add(torpedo);
		khlTeam.add(jokerit);
		
for(Team t : khlTeam){
	System.out.println(t.getName());
			
		}
		
		
		League khl = new League("KHL");
		khl.recordWinAndLoss("CSKA", "DINAMO");
		khl.recordWinAndLoss("SKA", "DINAMO");
		khl.

	}

}
