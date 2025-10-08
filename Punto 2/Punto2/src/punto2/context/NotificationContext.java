/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.context;

import punto2.strategy.NotificationStrategy;

/**
 *
 * @author Estudiantes
 */
public class NotificationContext {
    
    private NotificationStrategy strategy;
    
    public NotificationContext(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy(String message, String userId) {
        strategy.send(message, userId);
    }
}
