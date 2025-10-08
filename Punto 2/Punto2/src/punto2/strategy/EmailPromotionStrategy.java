/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.strategy;

/**
 *
 * @author Estudiantes
 */
public class EmailPromotionStrategy implements NotificationStrategy {
    
    @Override
    public void send(String message, String userId) {
        System.out.println("AD via email");
        System.out.println("For: user" + userId + "@bank.com");
        System.out.println("Affair: Exclusive Offers");
        System.out.println("content: " + message);
        System.out.println();
    }
}   