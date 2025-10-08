/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1.observers;

import Punto1.interfaces.Observer;
import Punto1.interfaces.Subject;
import Punto1.model.Course;
import Punto1.model.CourseAction;
import Punto1.subjects.CourseManagementSystem;

/**
 *
 * @author Estudiantes
 */
public class RadioHostObserver implements Observer {
    
    private String hostName;
    private String programName;
    private CourseManagementSystem courseSystem;
    
    public RadioHostObserver(String hostName, String programName, CourseManagementSystem courseSystem) {
        this.hostName = hostName;
        this.programName = programName;
        this.courseSystem = courseSystem;
        courseSystem.registerObserver(this);
    }
    
    @Override
    public void update() {
        Course course = courseSystem.getLastUpdatedCourse();
        CourseAction action = courseSystem.getLastAction();
        
        System.out.println("\n[" + programName + " - " + hostName + "]");
        
        switch (action) {
            case NUEVO:
                System.out.println("\n Creating Publicitary spot for: " + course.getTitle());
                break;
            case ACTUALIZADO:
                System.out.println("\n Updating the information of the Course: " + course.getTitle());
                break;
            case ELIMINADO:
                System.out.println("\n eliminanting the Course spot: " + course.getTitle());
                break;
        }
    }
    
}
