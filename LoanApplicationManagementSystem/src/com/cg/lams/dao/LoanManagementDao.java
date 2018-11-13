package com.cg.lams.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.cg.lams.bean.ApprovedLoans;
import com.cg.lams.bean.CustomerDetails;
import com.cg.lams.bean.LoanApplication;
import com.cg.lams.bean.LoanProgramsOffered;
import com.cg.lams.exception.LoanException;

public interface LoanManagementDao 
{
	//These are the methods accessible to the admin and lad
		public int login(String username, String password)throws LoanException;
		
		//These are the methods accessible to the admin
		public int addLoanProgram(LoanProgramsOffered loanPrograms) throws LoanException;
		public int deleteLoanProgram(String programName) throws LoanException;
		public int updateLoanProgram(LoanProgramsOffered loanPrograms) throws LoanException;
		public ArrayList<LoanApplication> viewAcceptedLoans() throws LoanException;
		public ArrayList<LoanApplication> viewRejectedLoans() throws LoanException;
		public ArrayList<ApprovedLoans> viewApprovedLoans() throws LoanException;
		
		//These are the methods accessible to the lad
		public ArrayList<LoanApplication> viewApplicationByLoanProgram(String programName) throws LoanException;
		public int updateApplicationStatus(int appId, String newStatus, Date date) throws LoanException;//change satus, add date
		public int setStatusAfterInterview(int appId, String newStatus) throws LoanException;
		public int addToApprovedLoan(ApprovedLoans ap) throws LoanException;
		//These methods are for the customer
		public int addCustomerDetails(LoanApplication loanApp, CustomerDetails custDetails) throws LoanException;
		public LoanApplication viewApplicationStatusById(int id) throws LoanException;
		
		//methods for everyone
		public ArrayList<LoanProgramsOffered> viewLoanProgramOffered() throws LoanException;
		
		//utilitymethod
		public LoanProgramsOffered getLoanProgramByName(String loanName) throws LoanException;

		public String getCustomerDetailsByAppId(int id) throws LoanException;

}
