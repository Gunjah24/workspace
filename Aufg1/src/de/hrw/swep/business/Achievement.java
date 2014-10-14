package de.hrw.swep.business;

/**
 * This class describes an achievement of a student containing the module name, the ECTS credit points and the score (grade).
 * 
 * @author Michael Friedrich
 * @version 1.0
 */
public class Achievement {
	/**
	 * the amount of credit points for this module
	 */
	private int credits;
	
	/**
	 * the grade on between 1 and 5 
	 */
	private float grade;
	
	/**
	 * the module name passed by the student
	 */
	private String module;
}
