package com.ng.merchant.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ng.merchant.dataobject.response.MerchantNotificationRRNResponseDTO;
import com.ng.merchant.dataobject.request.MerchantNotificationRequestDTO;
import com.ng.merchant.dataobject.response.MerchantNotificationResponseDTO;
import com.ng.merchant.service.INotificationService;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping(value = "/notification")
public class NotificationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationController.class);
	
	/*
	 * @Autowired private ISessionService managemetImpl;
	 */
	
	@Autowired 
	INotificationService notificationService;
	
	 @PostMapping(value = "/merchant/notify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<MerchantNotificationResponseDTO> saveMerchantNotification(@RequestHeader(HttpHeaders.CONTENT_TYPE) MediaType contentType,
    		 @RequestBody MerchantNotificationRequestDTO requestDTO) {
		 	LOGGER.info("Calling saveMerchantNotification() in NotificationController");
		 	if (!MediaType.APPLICATION_JSON.isCompatibleWith(contentType)) 
	            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(new MerchantNotificationResponseDTO("415", "Unsupported Media Type."));

	        try {
	            boolean isInserted = notificationService.saveMerchantNotification(requestDTO);
	            if (isInserted) 
	                return ResponseEntity.ok().body(new MerchantNotificationResponseDTO("00", "Notification saved successfully.", requestDTO.getRequestId()));
	             else 
	                return ResponseEntity.badRequest().body(new MerchantNotificationResponseDTO("500", "Failed to save the notification."));
	        } catch (Exception e) {
	            LOGGER.error("Exception occurred saveMerchantNotification() in NotificationController", e.getMessage());
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MerchantNotificationResponseDTO("500", "Server Error."));
	        }
    }
	 
	@PostMapping(value = "/merchant/fetchNotification", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFetchMerchantNotificationByRrn(@RequestHeader(HttpHeaders.CONTENT_TYPE) MediaType contentType,
    		 @RequestBody MerchantNotificationRequestDTO requestDTO) {
		LOGGER.info("Calling getFetchMerchantNotificationByRrn() in NotificationController");
	 	if (!MediaType.APPLICATION_JSON.isCompatibleWith(contentType)) 
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(new MerchantNotificationRRNResponseDTO("415", "Unsupported Media Type."));
	 	try {
	 			List<MerchantNotificationRRNResponseDTO> fetchNotificationByRrn = notificationService.getFetchMerchantNotificationByRrn(requestDTO.getRrn());
	 			if(fetchNotificationByRrn != null && !fetchNotificationByRrn.isEmpty()) {
	 				return ResponseEntity.ok().body(fetchNotificationByRrn);
	 			} else {
	 				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MerchantNotificationRRNResponseDTO("404", "No record found."));
	 			}
	 			
	 	} catch (Exception e) {
            LOGGER.error("Exception occurred getFetchMerchantNotificationByRrn() in NotificationController", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MerchantNotificationRRNResponseDTO("500", "Server Error."));
        }
		
	}
}
