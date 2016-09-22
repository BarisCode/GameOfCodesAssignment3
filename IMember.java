package library.interfaces.entities;

import java.util.List;

public interface IMember {
	
	public static final int   LOAN_LIMIT = 5;
	
	public static final float FINE_LIMIT = 10.0f;	
	
	
	public boolean hasOverDueLoans(); // interface method to check if a member has book loans overdue
	
	public boolean hasReachedLoanLimit(); // interface method to check if a member has reached the book loan limit
	
	public boolean hasFinesPayable(); // interace method to check if there are fines that a member can pay
	
	public boolean hasReachedFineLimit(); // interace method to check if a member has reached the fine limit
	
	public float   getFineAmount(); // interface method to obtain the amount of fine for a member
	
	public void    addFine(float fine); // interface method to add a fine to a member

	public void    payFine(float payment); // interface method to allow a member to pay fine corresponding
	
	public void    addLoan(ILoan loan); // interface method to add a new book loan by a member
	
	public List<ILoan> getLoans(); // interface method to get the list of loans
	
	public void removeLoan(ILoan loan); // interface method to remove a loan of a member
	
	public EMemberState getState(); // interface method to get the borrowing state of a member
	
	public String  getFirstName(); // interface method to get the first name of a customer
	
	public String  getLastName(); // interface method to retrieve the last name of a member
	
	public String  getContactPhone(); // interface method to obtain the phone number of a member
	
	public String  getEmailAddress(); // interface method to retrieve the email address of a member
	
	public int     getID(); // interface method to retrieve the ID of a member
	

}
