package com.example.stringboot2class.service.impl;

import com.example.stringboot2class.model.OrderDetail;
import com.example.stringboot2class.repository.OrderDetailRepository;
import com.example.stringboot2class.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Long id) {
        orderDetailRepository.deleteById(id);
    }

    @Override
    public Optional<OrderDetail> findById(Long id) {
        return orderDetailRepository.findById(id);
    }

    @Override
    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }
}
