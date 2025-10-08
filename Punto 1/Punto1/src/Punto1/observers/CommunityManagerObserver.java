/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1.observers;

import Punto1.interfaces.Observer;
import Punto1.model.Course;
import Punto1.model.CourseAction;
import Punto1.subjects.CourseManagementSystem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class CommunityManagerObserver implements Observer {
    
    private String name;
    private List<String> socialNetworks;
    private CourseManagementSystem courseSystem;
    
    public CommunityManagerObserver(String name, CourseManagementSystem courseSystem) {
        this.name = name;
        this.courseSystem = courseSystem;
        this.socialNetworks = new ArrayList<>();
        socialNetworks.add("Instagram");
        socialNetworks.add("TikTok");
        socialNetworks.add("Facebook");
        courseSystem.registerObserver(this);
    }
    
    @Override
    public void update() {
        Course course = courseSystem.getLastUpdatedCourse();
        CourseAction action = courseSystem.getLastAction();
        
        System.out.println("\nSocial media - CM : " + name);
        
        switch (action) {
            case NUEVO:
                System.out.println("Creating post for the Course: " + course.getTitle());
                for (String network : socialNetworks) {
                    System.out.println(" Post created in: " + network);
                }
                break;
            case ACTUALIZADO:
                System.out.println("Updating Post of the Course: " + course.getTitle());
                for (String network : socialNetworks) {
                    System.out.println(" Post updated in " + network);
                }
                break;
            case ELIMINADO:
                System.out.println("Eliminating Post of the Course: " + course.getTitle());
                for (String network : socialNetworks) {
                    System.out.println("  - Post Eliminated of " + network);
                }
                break;
        }
    }
}
