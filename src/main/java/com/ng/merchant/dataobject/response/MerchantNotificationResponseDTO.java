package com.ng.merchant.dataobject.response;

public class MerchantNotificationResponseDTO {
	
	public String responseCode;
	public String responseMessage;
	public Long requestId;
	
	// default constructor
	public MerchantNotificationResponseDTO() {
		
	}
	
	public MerchantNotificationResponseDTO(String responseCode, String responseMessage, Long requestId) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.requestId = requestId;
	}
	
	
	public MerchantNotificationResponseDTO(String responseCode, String responseMessage) {
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
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

}
