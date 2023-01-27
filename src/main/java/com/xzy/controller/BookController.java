package com.xzy.controller;

import com.xzy.domain.Book;
import com.xzy.exception.BusinessException;
import com.xzy.exception.SystemException;
import com.xzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Project_Name: springmvc-ssm
 * @Description:
 * @User: "XuZhaoYang"
 * @Date: 2023/1/22 15:28
 */

@RestController
// 公共映射
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);

        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);

    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);

        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);


    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);

        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable  Integer id) {
        // 将可能出现的异常报装，转换为自定义异常
        if (id < 0){
            throw new BusinessException(Code.BUSINESS_ERR,"请重新输入");
        }
//        try {
//            int i=1/0;
//        }catch (ArithmeticException e){
//            throw new SystemException(Code.SYSTEM_ERR,"系统异常,请稍等",e);
//        }
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK :Code.GET_ERR;
        String msg =  book != null ? "" :"查询失败，请重试";
        return new Result(code, book, msg);


    }

    @GetMapping
    public Result getAll() {
        List<Book> all = bookService.getAll();
        Integer code = all != null ? Code.GET_OK :Code.GET_ERR;
        String msg =  all != null ? "" :"查询失败，请重试";
        return new Result(code, all, msg);
    }
}
