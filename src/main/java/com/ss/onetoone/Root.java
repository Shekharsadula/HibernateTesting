package com.ss.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
@Entity
@Table(name="Root")
public class Root{
	@Id
    public String responseId;
	@Column
    public String receiptType;
	@Column
    public String asseseCode;
	@Column
    public String asseseName;
	@Column
    public String voucherDate;
    public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getReceiptType() {
		return receiptType;
	}
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}
	public String getAsseseCode() {
		return asseseCode;
	}
	public void setAsseseCode(String asseseCode) {
		this.asseseCode = asseseCode;
	}
	public String getAsseseName() {
		return asseseName;
	}
	public void setAsseseName(String asseseName) {
		this.asseseName = asseseName;
	}
	public String getVoucherDate() {
		return voucherDate;
	}
	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}
	public String getBillCollectorName() {
		return billCollectorName;
	}
	public void setBillCollectorName(String billCollectorName) {
		this.billCollectorName = billCollectorName;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getDdOrChequeNumber() {
		return ddOrChequeNumber;
	}
	public void setDdOrChequeNumber(String ddOrChequeNumber) {
		this.ddOrChequeNumber = ddOrChequeNumber;
	}
	public String getDdOrChequeDate() {
		return ddOrChequeDate;
	}
	public void setDdOrChequeDate(String ddOrChequeDate) {
		this.ddOrChequeDate = ddOrChequeDate;
	}
	public String getDdOrChequeBankName() {
		return ddOrChequeBankName;
	}
	public void setDdOrChequeBankName(String ddOrChequeBankName) {
		this.ddOrChequeBankName = ddOrChequeBankName;
	}
	public String getMachineEntryTimeStamp() {
		return machineEntryTimeStamp;
	}
	public void setMachineEntryTimeStamp(String machineEntryTimeStamp) {
		this.machineEntryTimeStamp = machineEntryTimeStamp;
	}
	public String geteSuvidhaTimeStamp() {
		return eSuvidhaTimeStamp;
	}
	public void seteSuvidhaTimeStamp(String eSuvidhaTimeStamp) {
		this.eSuvidhaTimeStamp = eSuvidhaTimeStamp;
	}
	public String getGlCode() {
		return glCode;
	}
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}
	public String getGlCodeDescription() {
		return glCodeDescription;
	}
	public void setGlCodeDescription(String glCodeDescription) {
		this.glCodeDescription = glCodeDescription;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getUlbCode() {
		return ulbCode;
	}
	public void setUlbCode(String ulbCode) {
		this.ulbCode = ulbCode;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getBcCode() {
		return bcCode;
	}
	public void setBcCode(String bcCode) {
		this.bcCode = bcCode;
	}
	@Column
	public String billCollectorName;
	@Column
    public String refNo;
	@Column
    public String ddOrChequeNumber;
	@Column
    public String ddOrChequeDate;
	@Column
    public String ddOrChequeBankName;
	@Column
    public String machineEntryTimeStamp;
	@Column
    public String eSuvidhaTimeStamp;
	@Column
    public String glCode;
	@Column
    public String glCodeDescription;
	@Column
    public String amount;
	@Column
    public String ulbCode;
	@Column
    public String districtCode;
	@Column
    public String bcCode;
}

