/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1.subjects;

import Punto1.interfaces.Observer;
import Punto1.interfaces.Subject;
import Punto1.model.Course;
import Punto1.model.CourseAction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class CourseManagementSystem implements Subject {
    
    private List<Observer> observers;
    private List<Course> courses;
    private Course lastUpdatedCourse;
    private CourseAction lastAction;
    
    public CourseManagementSystem() {
        observers = new ArrayList<>();
        courses = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer Registered. Total: " + observers.size());
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed. Total: " + observers.size());
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
    public void addCourse(Course course) {
        courses.add(course);
        lastUpdatedCourse = course;
        lastAction = CourseAction.NUEVO;
        System.out.println("\n New Course Added");
        System.out.println("Course: " + course.getTitle());
        notifyObservers();
    }
    
    public void updateCourse(Course course) {
        lastUpdatedCourse = course;
        lastAction = CourseAction.ACTUALIZADO;
        System.out.println("\n Course Updated");
        System.out.println("Course: " + course.getTitle());
        notifyObservers();
    }
    
    public void removeCourse(String courseId) {
        Course courseToRemove = null;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                courseToRemove = course;
                break;
            }
        }
        if (courseToRemove != null) {
            courses.remove(courseToRemove);
            lastUpdatedCourse = courseToRemove;
            lastAction = CourseAction.ELIMINADO;
            System.out.println("\n Course Eliminated");
            System.out.println("Course: " + courseToRemove.getTitle());
            notifyObservers();
        }
    }
    
    public Course getLastUpdatedCourse(){return lastUpdatedCourse;}
    public CourseAction getLastAction() {return lastAction;}
    public List<Course> getCourses() {return courses;} 

}
