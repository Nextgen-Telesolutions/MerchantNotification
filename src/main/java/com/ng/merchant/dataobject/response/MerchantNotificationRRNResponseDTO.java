package com.ng.merchant.dataobject.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchantNotificationRRNResponseDTO {
	
	public String responseCode;
	public String responseMessage;
	private String merchantId;
    private String transactionId;
    private String amount;
    private String cardHolder;
    private String cardScheme;
    private Long rrn;
    private String terminalId;
    
    public MerchantNotificationRRNResponseDTO() {
    	
    }
    
	public MerchantNotificationRRNResponseDTO(String responseCode, String responseMessage) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
	
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
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
	public Long getRrn() {
		return rrn;
	}
	public void setRrn(Long rrn) {
		this.rrn = rrn;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
    

}
