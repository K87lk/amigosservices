package com.amigoscode.notification.controller;

import com.amigoscode.clients.dto.NotificationRequest;
import com.amigoscode.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/notifications")
@Slf4j
@RestController
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public void sendNotification(NotificationRequest notificationRequest) {
        log.info("new notification: {}", notificationRequest);
        notificationService.sendNotification(notificationRequest);
    }
}
