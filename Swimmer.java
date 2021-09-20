package assignment;

import java.util.ArrayList;

//Don't forget to use extends
public class Swimmer{
	
	/**
	 * Constructor for the athlete class
	 * Don't forget to call the superclass constructor
	 * @param lName last name of the athlete
	 * @param fName first name of the athlete
	 * @param birthYear year the athlete was born
	 * @param birthMonth month the athlete was born
	 * @param birthDay day the athlete was born
	 * @param team name of professional team of the Swimmer
	 */
	public Swimmer(String lName, String fName, int birthYear, int birthMonth, int birthDay, String team) {
		
	}
	
	/**
	 * Method that returns the team of the Swimmer
	 * @return team
	 */
	public String getTeam() {
		return null;
	}

	/**
	 * Method that takes a event (a string) and adds it to the list of events that the Swimmer participates in
	 * 
	 * @param event should not be null
	 * @return 1 if the event was added successfully, 0 if the event is not valid or the event is already in the list
	 */
	public int addEvent(String singleEvent) {
		return -1;
	}
	
	/**
	 * Method that takes a list of events (an arraylist of strings) and adds it to the list of events that the Swimmer participates in
	 * @param event cannot be null
	 * @return the sum of all valid events added to the list
	 */
	public int addEvent(ArrayList<String> multiEvent) {
		return -1;
	}
	
	/**
	 *Returns a string about the Swimmer in the form 
	 * "Missy Franklin is 26 years, 3 months and 29 days old and is a swimmer for team: Colorado Stars and participates in the following events: [100M BACKSTOKE, 50M BACKSTOKE, 100M FREESTYLE]"
	 */
	public String toString() {
		return null;
	}
	

}
