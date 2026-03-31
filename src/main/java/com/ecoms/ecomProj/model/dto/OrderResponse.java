package com.ecoms.ecomProj.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
        String orderId,
        String customerName,
        String email,
        String status,
        @JsonFormat(pattern = "dd-MM-yyyy")
        LocalDate orderDate,
        List<OrderItemResponse> items
) {
}
