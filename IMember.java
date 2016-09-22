package library.interfaces.entities;

import java.util.List;

public interface IMember {
	
	public static final int   LOAN_LIMIT = 5;
	
	public static final float FINE_LIMIT = 10.0f;	
	
	
	public boolean hasOverDueLoans(); // interface method to check if a member has book loans overdue
	
	public boolean hasReachedLoanLimit(); // interface method to check if a member has reached the book loan limit
	
	public boolean hasFinesPayable(); // interace method to check if there are fines that a member can pay
	
	public boolean hasReachedFineLimit(); // interace method to check if a member has reached the fine limit
	
	public float   getFineAmount();
	
	public void    addFine(float fine);

	public void    payFine(float payment);
	
	public void    addLoan(ILoan loan);
	
	public List<ILoan> getLoans();
	
	public void    removeLoan(ILoan loan);
	
	public EMemberState   getState();
	
	public String  getFirstName();
	
	public String  getLastName();
	
	public String  getContactPhone();
	
	public String  getEmailAddress();
	
	public int     getID();
	

}
