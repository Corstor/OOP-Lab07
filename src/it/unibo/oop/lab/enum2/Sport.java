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
	 * Returns true if the sport defined by the object is an individual sport
	 * 
	 * @return boolean
	 */
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	/**
	 * Returns true if the sport defined by the object is practised indoor
	 * 
	 * @return boolean
	 */
	public boolean isIndoorSport() {
		return this.getPlace() == Place.INDOOR;
	}
	
	/**
	 * Returns the place where this sport is practised
	 * 
	 * @return Place
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return this.actualName + " is practised " + this.getPlace() + " by " + this.noTeamMembers + " people.";
	}
}
