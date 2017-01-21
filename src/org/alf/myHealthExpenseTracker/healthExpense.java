package org.alf.myHealthExpenseTracker;

import java.util.Date;

public class healthExpense {
	
	private String 	wording;
	private Date 	medicalActdate;
	private Date	bankMouvmentDate;
	/**
	 * @return the wording
	 */
	public String getWording() {
		return wording;
	}
	
	/**
	 * @param wording the wording to set
	 */
	public void setWording(String wording) {
		this.wording = wording;
	}
	
	/**
	 * @return the medicalActdate
	 */
	public Date getMedicalActdate() {
		return medicalActdate;
	}
	
	/**
	 * @param medicalActdate the medicalActdate to set
	 */
	public void setMedicalActdate(Date medicalActdate) {
		this.medicalActdate = medicalActdate;
	}
	
	/**
	 * @return the bankMouvmentDate
	 */
	public Date getBankMouvmentDate() {
		return bankMouvmentDate;
	}
	
	/**
	 * @param bankMouvmentDate the bankMouvmentDate to set
	 */
	public void setBankMouvmentDate(Date bankMouvmentDate) {
		this.bankMouvmentDate = bankMouvmentDate;
	}

}
