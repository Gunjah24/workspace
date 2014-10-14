package de.hrw.swep.business;

import java.util.Set;

/**
 * This class describes a student with name, matriculation number and the modules already passed.
 * 
 * @author Michael Friedrich
 * @version 1.0
 */
public class Student {
	/**
	 * student's name
	 */
	private String name;
	
	/**
	 * student's matriculation number
	 */
	private int matrikel;
	
	/**
	 * a set of achievements
	 */
	private Set<Achievement> grades;
	
	
}
