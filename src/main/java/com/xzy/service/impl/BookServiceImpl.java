package com.xzy.service.impl;

import com.xzy.dao.BookDao;
import com.xzy.domain.Book;
import com.xzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project_Name: springmvc-ssm
 * @Description:
 * @User: "XuZhaoYang"
 * @Date: 2023/1/22 15:27
 */

@Service
public class BookServiceImpl implements BookService {
    // 注入
    // 自动装配
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
