/**
 * 
 */
package org.alf.myHealthExpenseTracker;

import java.util.Date;

/**
 * @author fred
 *
 */
public class healthRepayment {
	private String 	wording;
	private Date 	medicalActeDate;
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
	 * @return the medicalActeDate
	 */
	public Date getMedicalActeDate() {
		return medicalActeDate;
	}
	/**
	 * @param medicalActeDate the medicalActeDate to set
	 */
	public void setMedicalActeDate(Date medicalActeDate) {
		this.medicalActeDate = medicalActeDate;
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
