package oopsconcept;

public class Refrence {

	public static void main(String[] args) {
		class Employee {
		    private String name;  // Encapsulated field
		    private int salary;

		    public void setName(String n) {
		        name = n;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setSalary(int s) {
		        if (s > 0) {
		            salary = s;
		        }
		    }

		    public int getSalary() {
		        return salary;
		    }
		}}}