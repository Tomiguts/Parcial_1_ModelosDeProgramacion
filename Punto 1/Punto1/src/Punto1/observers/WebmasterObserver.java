/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1.observers;

import Punto1.interfaces.Observer;
import Punto1.model.Course;
import Punto1.model.CourseAction;
import Punto1.subjects.CourseManagementSystem;

/**
 *
 * @author Estudiantes
 */
public class WebmasterObserver implements Observer {
    
    private String name;
    private CourseManagementSystem courseSystem;
    
    public WebmasterObserver(String name, CourseManagementSystem courseSystem) {
        this.name = name;
        this.courseSystem = courseSystem;
        courseSystem.registerObserver(this);
    }
    
    @Override
    public void update() {
        Course course = courseSystem.getLastUpdatedCourse();
        CourseAction action = courseSystem.getLastAction();
        
        System.out.println("\n Web Site - M: " + name );
        
        switch (action) {
            case NUEVO:
                System.out.println("Adding a new Course to the Web Site: " + course.getTitle());
                System.out.println("URL: /courses/" + course.getCourseId());
                break;
            case ACTUALIZADO:
                System.out.println("Updating the course information in the Web site: " + course.getTitle());
                break;
            case ELIMINADO:
                System.out.println("Removing Course of the web site: " + course.getTitle());
                break;
        }
    }
}
