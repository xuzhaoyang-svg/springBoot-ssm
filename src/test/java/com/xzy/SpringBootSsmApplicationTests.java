package com.xzy;

import com.xzy.dao.BookDao;
import com.xzy.domain.Book;
import com.xzy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootSsmApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById() {
        Book book = bookDao.getById(2);
        System.out.println(book);
    }
    @Test
    void testGetAll(){
        List<Book> all = bookDao.getAll();
        System.out.println(all);
    }

}
