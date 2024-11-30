package com.amigoscode.notification.service;


import com.amigoscode.clients.dto.NotificationRequest;
import com.amigoscode.notification.model.Notification;
import com.amigoscode.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest notificationRequest) {
        notificationRepository.save(Notification.builder()
                .message(notificationRequest.getMessage())
                .toCustomerId(notificationRequest.getToCustomerId())
                .toCustomerEmail(notificationRequest.getToCustomerEmail())
                .sender("Amigoscode")
                .sentAt(LocalDateTime.now())
                .build());
    }
}
