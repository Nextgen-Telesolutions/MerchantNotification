package com.ng.merchant.dao;

import java.util.List;

import com.ng.merchant.model.MerchantNotification;

public interface INotificationDao extends IBaseDao { //extends ISecureBankingDAO
	public List<MerchantNotification> getFetchMerchantNotificationByRrn(Long rrn);
}
