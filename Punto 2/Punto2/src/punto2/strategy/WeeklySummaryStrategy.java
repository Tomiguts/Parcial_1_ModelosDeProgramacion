/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.strategy;

/**
 *
 * @author Estudiantes
 */
public class WeeklySummaryStrategy implements NotificationStrategy {
    
    @Override
    public void send(String message, String userId) {
        System.out.println("weekly resume");
        System.out.println("User: " + userId);
        System.out.println("Resume: " + message);
        System.out.println("Day: Sunday 7:00 PM");
        System.out.println();
    }
}
