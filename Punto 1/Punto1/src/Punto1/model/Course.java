/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1.model;

/**
 *
 * @author Estudiantes
 */
public class Course {
    private String courseId;
    private String title;
    private String category;
    private int duration;
    private String instructor;
    
    public Course(String courseId, String title, String category, int duration, String instructor) {
        this.courseId = courseId;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.instructor = instructor;
    }
    

    public String getCourseId() { return courseId; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public int getDuration() { return duration; }
    public String getInstructor() { return instructor; }
    

    public void setTitle(String title) { this.title = title; }
    public void setCategory(String category) { this.category = category; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setInstructor(String instructor) { this.instructor = instructor; }
}
