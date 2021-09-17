/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */
import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {
    /*
    1.get input - hourly rate, hours worked, sales commission percent, and the total sales of a salesperson
    2.calculate hourly pay
    3.calculate total earnings
    4.display results
     */

    public static void main(String[] args) {

        double hourlyRate = getInput("What is your hourly rate?/enter a decimal");
        double hoursWorked = getInput("How many hours did you work this week?/enter a decimal");
        double salesCommission = getInput("What is your sales commission?/enter a decimal");
        double totalSales = getInput("How much did you sell in sales this week?/enter a decimal");
        double hourlyPay = hourlyPay(hourlyRate, hoursWorked);
        double Commission = Commission(totalSales, salesCommission);
        double totalEarnings = totalEarnings(hourlyPay, Commission);

        JOptionPane.showMessageDialog(null, displayResults(totalEarnings));

        System.exit(0);
    }

    //Input Method
    public static double getInput (String message) {
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    //Hourly Pay Method
    public static double hourlyPay (double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    //Commission Method
    public static double Commission(double totalSales, double salesCommission){
        return totalSales * salesCommission/100.0;
    }

    //Total Earnings Method
    public static double totalEarnings(double hourlyPay, double Commission){
        return hourlyPay + Commission;
    }

    public static String displayResults(double totalEarnings){
        DecimalFormat round = new DecimalFormat("#,###.00");
        String message = "Your total is: " + round.format(totalEarnings);
        return message;
    }
}
