/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     constructor*/
    public TicketMachine(Integer ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice()
    {
        return price;
    }
    
    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public Integer insertMoney(Integer amount)
    {
        balance = balance + amount;
        return balance;
    }
    
    public Integer calculateTotal(){
        total = balance + total;
        return total;
    }
    
    public Integer incrementTicketNumber(){
        ticketNumber++;
        return ticketNumber;
    }
    

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String printTicket()
    {
        //Increment the number of tickets printed
        incrementTicketNumber();
        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
        
        return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";
    }
}
//2.6 
//public class Student
//public class LabClass

//2.7
//Computers are not people and cannot figure out if you write things backwards - they mean different things. You must do public class Ticketmachine.
//In the diagram there are red x's across the changed object.
//2.8
//The error says identifier expected. It does not tell me that the syntax is backwards but it does help.
//2.9
//Fields: price, total, balance, ticketnumber. class: ticketmachine. constructor: ticketmachine.
//2.10
//The constructor assigns values to various fields.
//2.11
//a. integer.
//b. abstract.
//c. a string, to store a url.
//2.12
//alive, tutor, game.
//2.13
//Yes, it matters. Programming languages require very specific syntax.
//2.14
//Yes
//2.15
//Private Integer status
//2.16
//Student, as the constructor must have the same name as the class.
//2.17
//2, string and double.
//2.18
//String which is a series of characters, double which is a number.
//There are two fields, title and price.