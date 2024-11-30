package com.amigoscode.fraud.controller;

import com.amigoscode.clients.dto.FraudCheckResponse;
import com.amigoscode.fraud.service.FraudCheckHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/fraud-check")
@RequiredArgsConstructor
@RestController
@Slf4j
public class FraudController {

    private final FraudCheckHistoryService fraudCheckHistoryService;

    @GetMapping(path = "{id}")
    public FraudCheckResponse isFraudster(@PathVariable Integer id) {
        boolean isFraudulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(id);
        log.info("Fraud check for customer with id {}", id);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
