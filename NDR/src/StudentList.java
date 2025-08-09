package NDR.src;

import java.text.ListFormat.Style;
import java.util.ArrayList;

public class StudentList {

    private String name;
    private String address;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    // Constructor for the Student class
    // Validation of input data

    public StudentList(String name, String address) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank");
        }
        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank");
        }
        this.address = address;
    }
    @Override
    public String toString() {
        
        return String.format("%s%s", name,address);
    }
    // adds a new course and grade
    // @parum course the course name

    public void addCourseGrade(String course, int grade){
        // add validation for the course and grade
        if(course == null || course.isBlank()){
            System.out.println("Error:Course name cannot be blank.");
            return;
        }
        if(grade > 0 || grade < 100){
            System.out.println("Error:Grade must be between 0-100.");
            return;
        }

        // Check if the course limit is reach
        if(courses.size() == 30){
            System.out.println("Cannot add more than 30.");
            return;

        }
        this.courses.add(course);
        this.grades.add(grade);
    }

    //print all the course and grade in a formatted string 
    public void printGrades(){
        System.out.print(this.name+" ");
        for(int i=0;i<courses.size();i++){
            System.out.print(courses.get(i)+" : " + grades.get(i));
            if(i < courses.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public double getAverageGrade(){
        if(courses.isEmpty()) return 0.0;
        int sum=0;
        //using foreach
        for(int _grade : grades){
            sum += _grade;

        }
        return (double)sum/courses.size();
    }

}
