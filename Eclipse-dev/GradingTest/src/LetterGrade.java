import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.management.InvalidAttributeValueException;



public class LetterGrade implements Grade {
	
	private String grade;
	private HashMap<String, Integer> letterGrades = new HashMap<String, Integer>(); // KV pair of letter grades and their percent representation
	
	/**
	 * Parameterized constructor
	 * @param grade
	 */
	public LetterGrade(String grade) {
		super();
		setGrade(grade);
		letterHashMap();
	}
	

	/**
	 * Default Constructor
	 * Starting grade is F
	 */
	public LetterGrade() {
		this("F");
	} 

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	 * Default representation of the grade object - Letters are presented as strings
	 * @return Letter grade as string
	 */
	@Override
	public String toString() {
		return this.grade.toString();
	}

	/**
	 * If the letter is passing grade returns true, else false
	 * @return boolean
	 */
	@Override
	public boolean isPass() {
		switch (this.getGrade()) {
		case "A":
		case "B":
		case "C":
		case "D":
			return true;
		case "E":
		case "F":
			return false;
		default:
			return false;
		}
	}
	
	/**
	 * Letter grades can be included in the average
	 * @return true
	 */
	@Override
	public boolean includeInAverage() {
		return true;
	}
	
	
		
	/**
	 * Method that returns the percent representation of a letter grade
	 * If an invalid grade is entered an InvalidAttributeValueException
	 * is thrown
	 * Method used HashMap to iterate through all the keys (Letter Grades) and
	 * find what is the respective percent
	 * @param grade Letter grade as String
	 * @return Letter grade in percentage representation of Integer type
	 * @throws InvalidAttributeValueException
	 */
	@SuppressWarnings ("unchecked")
	public int toPercent (String letter) throws InvalidAttributeValueException {
		Set<Map.Entry<String, Integer>> mapEntrySet = letterGrades.entrySet();
		Iterator<Entry<String, Integer>> mapEntrySetIterator = mapEntrySet.iterator();
		
		while (mapEntrySetIterator.hasNext()) {
			Entry<String, Integer> entry = mapEntrySetIterator.next();
			if (entry.getKey().equals(letter))	{
				return entry.getValue();
			}
		}
		throw new InvalidAttributeValueException(
				"Invalid grade supplied to method LetterToPercent (String letter)"
				);
	}
	
	/**
	 * Private method that is used once to instantiate the Letter Grade hash map
	 */
	private void letterHashMap() {
		String[] grades = {"A", "B", "C", "D", "F"};
		for(String grade : grades) {
			if (grade.equals("A")) {
				letterGrades.put(grade, 100);
			}
			else if (grade.equals("B")) {	
					letterGrades.put(grade, 89);
				}
			else if (grade.equals("C")) {
					letterGrades.put(grade, 79);
				}
			else if (grade.equals("D")) {
					letterGrades.put(grade, 69);
			}
			else {
				letterGrades.put(grade, 0);
			}
		}
	}
}
