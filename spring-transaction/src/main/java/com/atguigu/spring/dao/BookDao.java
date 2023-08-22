package com.atguigu.spring.dao;

public interface BookDao {
    Integer getPriceById(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
