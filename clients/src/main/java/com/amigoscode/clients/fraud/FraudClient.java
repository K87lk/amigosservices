package com.amigoscode.clients.fraud;

import com.amigoscode.clients.dto.FraudCheckResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "fraud")
public interface FraudClient {
    @GetMapping(path = "api/v1/fraud-check/{id}")
    FraudCheckResponse isFraudster(@PathVariable Integer id);
}
