/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.strategy;

/**
 *
 * @author Estudiantes
 */
public class SMSPromotionStrategy implements NotificationStrategy {
    
    @Override
    public void send(String message, String userId) {
        System.out.println("Add via SMS");
        System.out.println("Phone: +57300" + userId);
        System.out.println("SMS: " + message);
        System.out.println();
    }
}
