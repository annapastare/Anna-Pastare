package lv.anna.module;

import java.util.ArrayList;

public class Team {
	String name;
	public int wins;
	public int losses;
	public int ties;
	
	public Team(String nameOfTeam){
		this.name = nameOfTeam;
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}


	@Override
	public String toString() {
		return "Team [name=" + name + ", wins=" + wins + ", losses=" + losses
				+ ", ties=" + ties + "]";
	}
	
	public int gamesPlayed(){
		return (this.wins + this.losses + this.ties);
	
	}
	
	public int totalPoint(){
		return (this.wins * 2 + this.ties); 
	}
	
	public int teamWithName(String nameToLookFor){
		int teamCreated = 0;
		return teamCreated;
		
	}

}
