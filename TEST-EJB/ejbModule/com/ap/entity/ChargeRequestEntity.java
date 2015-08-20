package com.ap.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChargeRequestEntity
 * 
 */

@Entity
@Table(name = "dbo.CHARGE_REQUESTS"/*
									 * , uniqueConstraints =
									 * 
									 * @UniqueConstraint(columnNames = {
									 * "CHARGE_REQUESTS_ID", "submitId" })
									 */)
public class ChargeRequestEntity implements Serializable {

	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// private int id;
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chargeRequestsId;
	@Id
	private String submitId;
	private int operator;
	private String telNo;
	private String amount;
	private int chargeType;
	private int submitResultCode;
	private String submitMessage;
	private int confirmResultCode;
	private String confirmMessage;
	private String confirmTransactionId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date changeDate;
	private static final long serialVersionUID = 1L;

	public ChargeRequestEntity() {
		super();
	}

	public ChargeRequestEntity(int operator, String telNo, String amount,
			int chargeType, int submitResultCode, String submitMessage,
			String submitId) {
		super();
		this.operator = operator;
		this.telNo = telNo;
		this.amount = amount;
		this.chargeType = chargeType;
		this.submitResultCode = submitResultCode;
		this.submitMessage = submitMessage;
		this.submitId = submitId;
		this.confirmMessage = "";
		this.confirmTransactionId = "";
		this.confirmResultCode = 0;
		Date currentDate = new Date();
		this.changeDate = currentDate;
		this.createDate = currentDate;

	}

	public ChargeRequestEntity(int operator, String telNo, String amount,
			int chargeType, int submitResultCode, String submitMessage,
			String submitId, int confirmResultCode, String confirmMessage,
			String confirmTransactionId, Date createDate, Date changeDate) {
		super();
		this.chargeRequestsId = chargeRequestsId;
		this.submitId = submitId;
		this.operator = operator;
		this.telNo = telNo;
		this.amount = amount;
		this.chargeType = chargeType;
		this.submitResultCode = submitResultCode;
		this.submitMessage = submitMessage;
		this.confirmResultCode = confirmResultCode;
		this.confirmMessage = confirmMessage;
		this.confirmTransactionId = confirmTransactionId;
		this.createDate = createDate;
		this.changeDate = changeDate;
	}

	public void setSubmitId(String submitId) {
		this.submitId = submitId;
	}

	public String getSubmitId() {
		return submitId;
	}

	public int getOperator() {
		return this.operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public int getSubmitResultCode() {
		return this.submitResultCode;
	}

	public void setSubmitResultCode(int submitResultCode) {
		this.submitResultCode = submitResultCode;
	}

	public String getSubmitMessage() {
		return this.submitMessage;
	}

	public void setSubmitMessage(String submitMessage) {
		this.submitMessage = submitMessage;
	}

	public int getConfirmResultCode() {
		return this.confirmResultCode;
	}

	public void setConfirmResultCode(int confirmResultCode) {
		this.confirmResultCode = confirmResultCode;
	}

	public String getConfirmMessage() {
		return this.confirmMessage;
	}

	public void setConfirmMessage(String confirmMessage) {
		this.confirmMessage = confirmMessage;
	}

	public String getConfirmTransactionId() {
		return this.confirmTransactionId;
	}

	public void setConfirmTransactionId(String confirmTransactionId) {
		this.confirmTransactionId = confirmTransactionId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public int getChargeType() {
		return chargeType;
	}

	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}

}
