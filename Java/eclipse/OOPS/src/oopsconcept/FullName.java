package oopsconcept;

import java.util.Scanner;


class Person {
 private String firstname;
 private String lastname;
 private String gender;
 private String maritalStatus;
 private String fullName;

 
 public String getFirstname() {
     return firstname;
 }

 public void setFirstname(String firstname) {
     this.firstname = firstname;
 }

 public String getLastname() {
     return lastname;
 }

 public void setLastname(String lastname) {
     this.lastname = lastname;
 }

 public String getGender() {
     return gender;
 }

 public void setGender(String gender) {
     this.gender = gender;
 }

 public String getMaritalStatus() {
     return maritalStatus;
 }

 public void setMaritalStatus(String maritalStatus) {
     this.maritalStatus = maritalStatus;
 }

 public String getFullName() {
     return fullName;
 }

 public void generateFullName() {
     String title;

     if (gender.equals("male")) {
         title = "Mr. ";
     } else if (maritalStatus. equals("single")) {
         title = "Miss. ";
     } else { 
         title = "Mrs. ";
     }

     String firstLetterOfLastName = lastname.toUpperCase().charAt(0) + ". ";
     String capitalizedFirstName = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
     this.fullName = title + firstLetterOfLastName + capitalizedFirstName;
 }
}

public class FullName {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Person p = new Person();

     System.out.print("Enter firstname: ");
     p.setFirstname(scan.next());

     System.out.print("Enter lastname: ");
     p.setLastname(scan.next());

     System.out.print("Enter gender (male/female): ");
     p.setGender(scan.next());

     System.out.print("Enter marital status (single/married): ");
     p.setMaritalStatus(scan.next());
 
     p.generateFullName();

     System.out.println("Full name: " + p.getFullName());

     scan.close();
 }
}
chirchita
Achyranthes aspera 