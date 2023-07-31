package com.te.hibernatemapping.dto;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Bank_Account_Holder")
public class BankAccountHolder implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankAccountHolderId;
	private String bankAccountHolderName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumns({
			@JoinColumn(name="Account_Id",referencedColumnName="bankAccountHolderId"),
			@JoinColumn(name="User_Name",referencedColumnName="bankAccountHolderName")
	})
	
	private List<BankAccount> listOfBankAccouns;
	public int getBankAccountHolderId() {
		return bankAccountHolderId;
	}
	public void setBankAccountHolderId(int bankAccountHolderId) {
		this.bankAccountHolderId = bankAccountHolderId;
	}
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}
	public List<BankAccount> getListOfBankAccouns() {
		return listOfBankAccouns;
	}
	public void setListOfBankAccouns(List<BankAccount> listOfBankAccouns) {
		this.listOfBankAccouns = listOfBankAccouns;
	}

}
