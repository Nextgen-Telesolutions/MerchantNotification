package com.ng.merchant.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ng.merchant.dataobject.request.MerchantNotificationRequestDTO;
import com.ng.merchant.dataobject.response.MerchantNotificationRRNResponseDTO;


public interface INotificationService {
	
	public boolean saveMerchantNotification(MerchantNotificationRequestDTO dto);
	public List<MerchantNotificationRRNResponseDTO> getFetchMerchantNotificationByRrn(Long rrn) throws Exception;
}
