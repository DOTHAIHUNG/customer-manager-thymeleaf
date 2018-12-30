package com.hk2t.service;

import com.hk2t.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map <Integer, Customer> customers;

    static {
        customers = new HashMap <>();
        customers.put(1, new Customer(1, "Trung", "trunglk@gmail.com", "Ha Tinh"));
        customers.put(2, new Customer(2, "Phu", "phuvd@gmail.com", "Hai Phong"));
        customers.put(3, new Customer(3, "Hung", "hk2t.thaihung@gmail.com", "Thai Binh"));
        customers.put(4, new Customer(4, "Lam Anh", "lanh@gmail.com", "Thai Binh"));
        customers.put(5, new Customer(5, "Tra", "tra@gmail.com", "Nghe An"));
        customers.put(6, new Customer(6, "Duc", "ducvm@gmail.com", "Hung Yen"));
        customers.put(7, new Customer(7, "Khanh", "khanhnn@gmail.com", "Ha Noi"));
        customers.put(8, new Customer(8, "Thanh", "thanhdt@gmail.com", "Sai Gon"));
    }

    @Override
    public List <Customer> findAll() {
        return new ArrayList <>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
