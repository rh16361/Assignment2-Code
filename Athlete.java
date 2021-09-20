package assignment;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Athlete {
	
	private String lName;
	private String fName;
	private int birthYear;
	private int birthMonth;
	private int birthDay; 
	ArrayList <String> eventSport = new ArrayList<String>();
	
	
	
	// erase later for testing only 

    
 
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * Constructor for the athlete class
	 * @param lName last name of the athlete
	 * @param fName first name of the athlete
	 * @param birthYear year the athlete was born
	 * @param birthMonth month the athlete was born
	 * @param birthDay day the athlete was born
	 */
	public Athlete(String lName, String fName, int birthYear,  int birthMonth, int birthDay){
		
		this.lName = lName;
		this.fName = fName;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		
		
		
		
		
	}
	
	/**
	 * Method that computes the current age of the athlete.
	 * 
	 * The string should go years, then months, then days.
	 * The string should end with " old".
	 * Years should only be included if it's greater than 0.
	 * Months should only be included if it's greater than 0.
	 * Days should only be included if it's greater than 0.
	 * If any of years, months, or days are greater than 1, they should include an 's' at the end.
	 * If there are two terms, they should be separated by " and ".
	 * If there are three terms, the first two terms should be separated by ", "
	 * 	and the second and third terms should be separated by " and ".
	 * 
	 * Examples:
	 * "26 years, 3 months and 29 days old"
	 * "26 years and 5 months old"
	 * "5 months and 4 days old"
	 * "26 years old"
	 * "1 year, 1 month and 1 day old"
	 * 
	 * @return a string representation of the athlete's age.
	 */
	public String computeAge(){
		
		// using method to subtract dates and get difference in days, months, years between current date and birth date.
		
	    long dayDiff = getBirthDate().until(getCurrentDate(), ChronoUnit.DAYS );
	    long monthDiff =  getBirthDate().until(getCurrentDate(), ChronoUnit.MONTHS );
	    long yearDiff =  getBirthDate().until(getCurrentDate(), ChronoUnit.YEARS); 
	          
	    // calculate days per month and year. Next subtracts the daysDiff from the total of years and months converted to days. The difference will give the remainder of days.
	    
	    final long DAYS_PER_MONTH = (long)(365.2425/12);
	    final long DAYS_PER_YEAR = (long)365.2425;
	    final long DAYS_PER_WEEK = (long )7;
	 
	   
	    long ageInyears = dayDiff /DAYS_PER_YEAR ;
	    long remainDaysAfterYears = dayDiff% DAYS_PER_YEAR;
	    long ageInMonths = remainDaysAfterYears / DAYS_PER_MONTH ;
	    long remainDayAfterMonths = remainDaysAfterYears % DAYS_PER_MONTH ;
	    long ageInDays =  remainDayAfterMonths/DAYS_PER_MONTH;
	  
	   
	     
	    // if statements
	     
	    String ageInYearsMonthsDays = ageInyears+" years, "+ageInMonths+" months "+" and "+ageInDays+ " days old";
	    
	    
	    
	    return ageInYearsMonthsDays;     
	     
	     
	     
	     
	   
	 
	         
	         
	    
	  
	    
	   
	   
	    
		
		
		
		
		
		
	
	}
	
	
	
	
	/**
	 * Method that computes the number of days between the athlete's birth to now
	 * @return a number representing days since birth
	 */
	public long daysSinceBirth() {
		 long days	=   ChronoUnit.DAYS.between(getBirthDate(),getCurrentDate());
		    return days;
	}	
	
	public String getlName() {
		return this.lName;
	}

	public String getfName() {
		return this.fName;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public int getBirthMonth() {
		return this.birthMonth;
	}

	public int getBirthDay() {
		return this.birthDay;
	}

	
	

	public ArrayList<String> getEventSport() {
		return eventSport;
	}

	/**
	 * Method that returns the athlete's first name
	 * @return fName
	 */
	public String getFName() {
		return this.fName;
	}

	/**
	 * Method that returns the athlete's last name
	 * @return lName
	 */
	public String getLName() {
		return this.lName;
	}

	/**
	 * method that returns the athlete's first name followed by last name followed by athlete's current age
	 * "Daffy Duck is 21 years and 1 day old"
	 */
	public String toString() {
		return getFName()+" "+getLName()+" is "+computeAge();
	}
	
	/**
	 * Method that compares two athlete objects
	 * @return  true if first name and last name and days since birth are the same
	 * 			false otherwise
	 */
	public boolean equals(Object athlete) {
		
		if (this.toString().equals(athlete.toString())){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Method that returns the arraylist of events that the athlete participates in
	 * @return events
	 */
	public ArrayList<String> getEvents() {
		return this.eventSport;
	}
	
	/**
	 * Method that takes a event (a string) and adds it to the list of events that the Athlete participates in
	 * 
	 * @param event cannot be null
	 * @return 1 if the event was added successfully, 0 if the event is null or the event is already in the list
	 */
	public int addEvent(String event) {

		if (event != null) {
		  eventSport.add(event);
		  return 1;
	   } 
		
		return 0;
   }
	
	// method for the current date.
	public LocalDate getCurrentDate(){
		LocalDate presentDate = java.time.LocalDate.now(); 
		return presentDate;
		
		
	}
	
	// method to convert birth date info into a Local Date variable;
	public LocalDate getBirthDate() {
		LocalDate birthDate = LocalDate.of(getBirthYear(), getBirthMonth(), getBirthDay());
		return birthDate;
	}
	
	// for testing only will erase
	

		
		 
	
		
		
		
	}
	
	
	










