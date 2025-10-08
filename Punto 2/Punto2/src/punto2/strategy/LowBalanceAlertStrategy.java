/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.strategy;

/**
 *
 * @author Estudiantes
 */
public class LowBalanceAlertStrategy implements NotificationStrategy {
    
    private double threshold;
    
    public LowBalanceAlertStrategy(double threshold) {
        this.threshold = threshold;
    }
    
    @Override
    public void send(String message, String userId) {
        System.out.println("Alert low balance");
        System.out.println("User: " + userId);
        System.out.println("Threshold: " + threshold);
        System.out.println("Alert: " + message);
        System.out.println();
    }
}
