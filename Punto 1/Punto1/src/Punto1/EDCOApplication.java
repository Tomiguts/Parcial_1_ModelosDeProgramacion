/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto1;

import Punto1.model.Course;
import Punto1.observers.RadioHostObserver;
import Punto1.subjects.CourseManagementSystem;

/**
 *
 * @author Estudiantes
 */
public class EDCOApplication {

    public static void main(String[] args) {
        System.out.println("System of administration of courses");
        
        CourseManagementSystem edcoSystem = new CourseManagementSystem();
        
        RadioHostObserver luzDary = new RadioHostObserver(
            "Luz Dary Varela",
            "Masters and Learning",
            edcoSystem
        );    
    
    
    Course curso1 = new Course(
            "IA001",
            "IA Applied to the education",
            "AI",
            40,
            "Dr. Fulgencio"
        );
    edcoSystem.addCourse(curso1);
    edcoSystem.updateCourse(curso1);
    edcoSystem.removeCourse("IA001");
    }
}
