package com.ng.merchant.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ng.merchant.dataobject.response.MerchantNotificationRRNResponseDTO;
import com.ng.merchant.dataobject.request.MerchantNotificationRequestDTO;
import com.ng.merchant.model.MerchantNotification;
//import com.ng.merchant.dao.IInventoryMgmtDAO;
import com.ng.merchant.dao.INotificationDao;
import com.ng.merchant.service.INotificationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service("notificationService")
public class NotificationServiceImpl implements INotificationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationServiceImpl.class);
	
	@Autowired
	private INotificationDao notificationDao;
	
	
	@Transactional
	@Override
	public boolean saveMerchantNotification(MerchantNotificationRequestDTO dto) {
		boolean flag = false;
		try {
			MerchantNotification merchNotification = new MerchantNotification();
			 merchNotification.setCreateDate(new Date());
			 BeanUtils.copyProperties(dto, merchNotification);
			 notificationDao.saveObject(merchNotification);
			LOGGER.info("saved successfully in saveMerchantNotification() of NotificationServiceImpl : "+ flag);
			flag = true;
		} catch(Exception e){
			e.printStackTrace();
			LOGGER.info("Exception while save in saveMerchantNotification() of NotificationServiceImpl : "+e.getMessage());
		}
		return flag;
	}

	@Override
	public List<MerchantNotificationRRNResponseDTO> getFetchMerchantNotificationByRrn(Long rrn) throws Exception {
		List<MerchantNotification> fetchNotificationByRrn = notificationDao.getFetchMerchantNotificationByRrn(rrn);
		List<MerchantNotificationRRNResponseDTO> responseDTOs = new ArrayList<MerchantNotificationRRNResponseDTO>();
	    for (MerchantNotification notification : fetchNotificationByRrn) {
	        MerchantNotificationRRNResponseDTO responseDTO = new MerchantNotificationRRNResponseDTO();
	        BeanUtils.copyProperties(notification, responseDTO);
	        responseDTOs.add(responseDTO);
	    }
	    return responseDTOs;
	}

}
