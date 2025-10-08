/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto2;

import punto2.context.NotificationContext;
import punto2.model.User;
import punto2.strategy.DailySummaryStrategy;
import punto2.strategy.EmailPromotionStrategy;
import punto2.strategy.InstantTransactionStrategy;
import punto2.strategy.LowBalanceAlertStrategy;
import punto2.strategy.SMSPromotionStrategy;
import punto2.strategy.WeeklySummaryStrategy;

/**
 *
 * @author Estudiantes
 */
public class BankingApp {
    
    public static void main(String[] args) {
        
        System.out.println("System of notifications \n");
        
        User usuario = new User("12345", "Tomiguts", 500000);
        
        System.out.println("User: " + usuario.getName());
        System.out.println("initial Money: " + usuario.getBalance());
        
        NotificationContext context = new NotificationContext(new InstantTransactionStrategy());
        context.executeStrategy("Transfer done: 50.000", usuario.getUserId());
        

        context.setStrategy(new DailySummaryStrategy());
        context.executeStrategy("5 transactions Total: 200.000", usuario.getUserId());
        
        context.setStrategy(new WeeklySummaryStrategy());
        context.executeStrategy("20 transactions / income: 1.000.000 / bills: 800,000", usuario.getUserId());
        
        usuario.setBalance(30000);
        context.setStrategy(new LowBalanceAlertStrategy(50000));
        context.executeStrategy("You'r actual balance is: " + usuario.getBalance(), usuario.getUserId());
        
        context.setStrategy(new EmailPromotionStrategy());
        context.executeStrategy("15% of discount in shopping with Debit/Credit card", usuario.getUserId());
        
        context.setStrategy(new SMSPromotionStrategy());
        context.executeStrategy("You´r handling fee its free this month", usuario.getUserId());
        
    }
}
