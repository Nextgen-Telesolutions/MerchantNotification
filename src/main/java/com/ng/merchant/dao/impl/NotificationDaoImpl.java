package com.ng.merchant.dao.impl;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.ng.merchant.model.MerchantNotification;
import com.ng.merchant.dao.INotificationDao;

@Transactional
@Repository(value="notificationDao")
public class NotificationDaoImpl extends BaseDaoImpl implements INotificationDao {

	
	@SuppressWarnings("unchecked")
	public List<MerchantNotification> getFetchMerchantNotificationByRrn(Long rrn) {
		List<MerchantNotification> rrnList = null;
		try {
			/*loginInfo = findObjectByNamedQuery("Subscriber.findByAnyId", createMapForQueryParams(
					new String[] { "userId" },
					new Object[] { loginId }), Subscriber.class);*/
			
		rrnList =  (List<MerchantNotification>) findObjectByNamedQuery("MerchantNotification.findAllByRrn", createMapForQueryParams(
					new String[] {"rrn" },
					new Object[] { rrn } ), MerchantNotification.class
				);
		} catch(Exception e) {
			e.printStackTrace();
		}
		//query.setParameter("rrn",rrn);
		//rrnList = query.getResultList();
		return rrnList;
	}
}
