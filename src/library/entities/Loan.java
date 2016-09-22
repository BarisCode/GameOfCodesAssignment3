/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

/**
 *
 * @author Nikul
 */


import java.text.DateFormat;
import java.util.Date;

import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.entities.ELoanState;

public class Loan implements ILoan 
{
	private int id;	// Id of the Loan
	private final IMember borrower;	// IMember instance 
	private final IBook book;	// IBook instance
	private Date borrowDate;	// Borrow date and due date instances.
	private Date dueDate;
	private ELoanState state;	// State of the Loan
	
	// Create and Initialize the loan object.
	public Loan(IBook book, IMember borrower, Date borrowDate, Date returnDate) 
        {
            if (!sane(book, borrower, borrowDate, returnDate))
            {
		throw new IllegalArgumentException("Loan: constructor : bad parameters");
            }
            this.book = book;
            this.borrower = borrower;
            this.borrowDate = borrowDate;
            this.dueDate = returnDate;	
            this.state = ELoanState.PENDING;
	}
	// Check for not null value and not same value of borrow and return date.
	private boolean sane(IBook book, IMember borrower, Date borrowDate, Date returnDate) 
        {
		return  ( book != null && 
				  borrower != null && 
				  borrowDate != null && 
				  returnDate != null && 
				  borrowDate.compareTo(returnDate) <= 0);
	}

	// Commit the Loan.
	@Override
	public void commit(int loanId) 
        {
            if (!(state == ELoanState.PENDING)) 
            {
		throw new RuntimeException(String.format("Loan : commit : incorrect state transition  : %s -> %s\n", 
							state, ELoanState.CURRENT));
            }
            if (loanId <= 0)
            {
		throw new RuntimeException(String.format("Loan : commit : id must be a positive integer  : %d\n", 
							loanId));
            }
            
            this.id = loanId;	// Assign loan id
            state = ELoanState.CURRENT;	// assign current state to loan object.
            book.borrow(this);	// Borrow the book.
            borrower.addLoan(this);	// Add loan into the member.
	}

	// Check the complete the loan.
	@Override
	public void complete() 
        {
            if (!(state == ELoanState.CURRENT || state == ELoanState.OVERDUE)) 
            {
		throw new RuntimeException(String.format("Loan : complete : incorrect state transition  : %s -> %s\n",
							state, ELoanState.COMPLETE));
            }
            state = ELoanState.COMPLETE;	// Assign complete state.		
	}

	// Return true if loan is over due.
	@Override
	public boolean isOverDue() 
        {
            return (state == ELoanState.OVERDUE);
	}

	// Check the loan is over due.
	@Override
	public boolean checkOverDue(Date currentDate) 
        {
            if (!(state == ELoanState.CURRENT || state == ELoanState.OVERDUE )) // Incorrect transition.
            {
		throw new RuntimeException(String.format("Loan : checkOverDue : incorrect state transition  : %s -> %s\n",
							state, ELoanState.OVERDUE));
            }
	
            if (currentDate.compareTo(dueDate) > 0) 
            {
		state = ELoanState.OVERDUE;
            }
            
            return isOverDue(); // call the isOverDue method.
	}
	
	// Return the borrower.
	@Override
	public IMember getBorrower() 
        {
		return borrower;
	}

	// Return the book object.
	@Override
	public IBook getBook() 
        {
		return book;
	}

	@Override
	public int getID() 
        {
		return id;
	}
        
	public void setState(ELoanState state)
        {
            this.state = state;
        }
        
	public ELoanState getState() 
        {
		return state;
	}

	@Override
	public String toString() 
        {
            return (String.format("Loan ID:  %d\nAuthor:   %s\nTitle:    %s\nBorrower: %s %s\nBorrowed: %s\nDue Date: %s", 
				id, book.getAuthor(), book.getTitle(), borrower.getFirstName(), borrower.getLastName(),
				DateFormat.getDateInstance().format(borrowDate),
				DateFormat.getDateInstance().format(dueDate)));
	}
}
