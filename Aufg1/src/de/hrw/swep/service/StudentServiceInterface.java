package de.hrw.swep.service;

import java.util.Set;

import de.hrw.swep.business.Student;

/**
 * This is the service interface for all other parts of the application to use. 
 * The student service uses the DataStoreInterface to get the relevant information. It also builds the business objects Student and 
 * Achievement out of the information retrieved from the DataStore.  
 * 
 * 
 * @author Michael Friedrich
 *
 */
public interface StudentServiceInterface {
	
	/**
	 * returns the average grade of all exams for a given module
	 *  
	 * @param module the module name
	 * @return the average grade of all exams of this module
	 */
	float getAverageGrade(String module);
	
	
	/**
	 * returns the weighted average grade of a given student identified by its matriculation number
	 * 
	 * weighted average grade means, that the grade is weighted by the number of credit points. Grades worse than 
	 * 4.0 are ignored as this means, the exam was not passed.
	 * 
	 * 
	 * @param matrikel the matriculation number of the student
	 * @return the weighted average grade of the student
	 */
	float getAverageGrade(int matrikel);
	
	/**
	 * returns the set of all modules
	 * 
	 * actually this is the set of all modules with at least one student having already taken the exam.
	 * 
	 * @return the set of all module names
	 */
	Set<String> getAllModules();
	
	/**
	 * returns the set of all students. The Student objects are filled with name and matriculation number. The set of achievements
	 * is set to null.
	 * 
	 * @return all students with their name and matriculation number but without grades
	 */
	Set<Student> getAllStudents();
}
