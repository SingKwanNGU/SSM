package com.atguigu.spring.service.Impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional
    public void buyBook(Integer userId, Integer bookId) {
        Integer price=bookDao.getPriceById(bookId);

        bookDao.updateStock(bookId);

        bookDao.updateBalance(userId,price);


    }
}
