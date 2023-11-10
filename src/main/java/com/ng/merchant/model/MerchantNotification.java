package com.ng.merchant.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "nrc_merchant_notification")
@NamedQueries
({
	@NamedQuery(name="MerchantNotification.findAllByRrn", query="SELECT mn FROM MerchantNotification mn where mn.rrn= :rrn"),
})
public class MerchantNotification implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "response_message")
    private String responseMessage;

    @Column(name = "amount")
    private String amount;

    @Column(name = "card_holder")
    private String cardHolder;

    @Column(name = "card_scheme")
    private String cardScheme;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "expiry")
    private Integer expiry;

    @Column(name = "pan")
    private String pan; // pan no in mask 

    @Column(name = "ref_code")
    private Long refCode;

    @Column(name = "response_code")
    private String responseCode;

    @Column(name = "rrn")
    private Long rrn;

    @Column(name = "stan")
    private Integer stan;

    @Column(name = "terminal_id")
    private String terminalId;

    @Column(name = "request_id")
    private Long requestId;
    
    @Column(name = "createDate")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Column(name = "field1")
    private String field1;

    @Column(name = "field2")
    private String field2;

    @Column(name = "field3")
    private String field3;

    @Column(name = "field4")
    private String field4;

    @Column(name = "field5")
    private String field5;

    @Column(name = "field6")
    private String field6;

    @Column(name = "field7")
    private String field7;

    @Column(name = "field8")
    private String field8;

    @Column(name = "field9")
    private String field9;

    @Column(name = "field10")
    private String field10;

    @Column(name = "field11")
    private String field11;

    @Column(name = "field12")
    private String field12;

    @Column(name = "field13")
    private String field13;

    @Column(name = "field14")
    private String field14;

    @Column(name = "field15")
    private String field15;

    @Column(name = "field16")
    private String field16;

    @Column(name = "field17")
    private String field17;

    @Column(name = "field18")
    private String field18;

    @Column(name = "field19")
    private String field19;

    @Column(name = "field20")
    private String field20;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCardScheme() {
		return cardScheme;
	}

	public void setCardScheme(String cardScheme) {
		this.cardScheme = cardScheme;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getExpiry() {
		return expiry;
	}

	public void setExpiry(Integer expiry) {
		this.expiry = expiry;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Long getRefCode() {
		return refCode;
	}

	public void setRefCode(Long refCode) {
		this.refCode = refCode;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Long getRrn() {
		return rrn;
	}

	public void setRrn(Long rrn) {
		this.rrn = rrn;
	}

	public Integer getStan() {
		return stan;
	}

	public void setStan(Integer stan) {
		this.stan = stan;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public String getField7() {
		return field7;
	}

	public void setField7(String field7) {
		this.field7 = field7;
	}

	public String getField8() {
		return field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}

	public String getField9() {
		return field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	public String getField11() {
		return field11;
	}

	public void setField11(String field11) {
		this.field11 = field11;
	}

	public String getField12() {
		return field12;
	}

	public void setField12(String field12) {
		this.field12 = field12;
	}

	public String getField13() {
		return field13;
	}

	public void setField13(String field13) {
		this.field13 = field13;
	}

	public String getField14() {
		return field14;
	}

	public void setField14(String field14) {
		this.field14 = field14;
	}

	public String getField15() {
		return field15;
	}

	public void setField15(String field15) {
		this.field15 = field15;
	}

	public String getField16() {
		return field16;
	}

	public void setField16(String field16) {
		this.field16 = field16;
	}

	public String getField17() {
		return field17;
	}

	public void setField17(String field17) {
		this.field17 = field17;
	}

	public String getField18() {
		return field18;
	}

	public void setField18(String field18) {
		this.field18 = field18;
	}

	public String getField19() {
		return field19;
	}

	public void setField19(String field19) {
		this.field19 = field19;
	}

	public String getField20() {
		return field20;
	}

	public void setField20(String field20) {
		this.field20 = field20;
	}
	
    
}
