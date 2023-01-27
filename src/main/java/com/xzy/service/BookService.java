package com.xzy.service;

import com.xzy.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 增删改返回值为Boolean
 */

// 添加事务
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    public List<Book> getAll();
}
