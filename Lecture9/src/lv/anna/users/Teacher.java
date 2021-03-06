package lv.anna.users;

import java.util.Arrays;

public class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 4;
	
	public Teacher(String name, String address){
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
		
	}
	public void addCourse(String course){
		courses[numCourses] = course;
		++numCourses;
		System.out.println(Arrays.toString(this.courses));
		
	}
public boolean addCoourses(String coourse){
	return true;
	
}
    public String toString(){
    	return "Teacher: "+ super.toString();
    	
    }
}
