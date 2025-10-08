/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.strategy;

/**
 *
 * @author Estudiantes
 */
public class InstantTransactionStrategy implements NotificationStrategy {
    
    @Override
    public void send(String message, String userId) {
        System.out.println("instant notification");
        System.out.println("User: " + userId);
        System.out.println("Transaction: " + message);
        System.out.println("Hour: real time\n");
    }
}