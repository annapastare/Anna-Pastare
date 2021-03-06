package lv.anna.module;

import java.util.ArrayList;

public class League {
private String name;
private ArrayList<Team> nameOfTeam;

public League(String leagueName){
	this.name = leagueName;
	this.nameOfTeam = new ArrayList<>();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Team> getNameOfTeam() {
	return nameOfTeam;
}
public void setNameOfTeam(ArrayList<Team> nameOfTeam) {
	this.nameOfTeam = nameOfTeam;
}
public void recordWinAndLoss(String winnerName, String loserName){
	Team winner;
	Team loser;
	winner = this.teamWithName(winnerName);
	loser = this.teamWithName(loserName);
	
	winner.wins++;
	loser.losses++;
}
public void recordOnlyTies(Team teamA, Team teamB){
	teamA.ties++;
	teamB.ties++;
}

public Team teamWithName(String nameToLookFor){
	Team teamCreated = null;
	for(Team team : this.nameOfTeam){
		if(team.name.equals(nameToLookFor)){
			teamCreated = team;
		}
	}
	return null;
}

@Override
public String toString() {
	return "League [name=" + name + ", nameOfTeam=" + nameOfTeam + "]";
} 


}
