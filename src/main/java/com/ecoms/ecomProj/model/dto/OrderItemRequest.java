package com.ecoms.ecomProj.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
