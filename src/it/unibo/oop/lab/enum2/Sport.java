/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    BASKET(Place.INDOOR, 7, "Basket"), 
    VOLLEY(Place.INDOOR, 7, "Volley"), 
    TENNIS(Place.INDOOR, 2, "Tennis"), 
    BIKE(Place.OUTDOOR, 1, "Bike"), 
    F1(Place.OUTDOOR, 1, "F1"), 
    MOTOGP(Place.OUTDOOR, 1, "MotoGP"), 
    SOCCER(Place.OUTDOOR, 7, "Soccer");
    
	private final int noTeamMembers;
    private final String actualName;
	private final Place place;
	
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;
		this.place = place;
	}

	/**
	 * Must return true if called on individual sports
	 * 
	 * @return true if the sport is individual, false in any other case
	 */
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	/**
	 * Must return true if the sport is practiced indoor
	 * 
	 * @return true if the sport is practiced indoor, false in any other case
	 */
	public boolean isIndoorSport() {
		return this.getPlace() == Place.INDOOR;
	}
	
	/**
	 * Must return the place where this sport is practiced
	 * 
	 * @return the place where the sport is practiced
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
     * Returns the string representation of a sport.
     * 
     * @return the text representation of the sport
     */
	public String toString() {
		return this.actualName + " is practised " + this.getPlace() + ", by " + this.noTeamMembers + " people.";
	}
}
