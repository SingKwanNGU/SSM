package com.atguigu.spring.dao.Impl;

import com.atguigu.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer getPriceById(Integer bookId) {
        String sql="select price from t_book where book_id=?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class,bookId);
        return price;
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql="update t_book set stock=stock-1 where book_id=? ";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql="update t_user2 set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,price,userId);
    }
}
