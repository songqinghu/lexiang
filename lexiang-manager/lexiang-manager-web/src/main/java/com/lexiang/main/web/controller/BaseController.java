package com.lexiang.main.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * <p>Title: BaseController.java</p>
 * <p>Description:接口基础类 </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月14日下午11:03:48
 * @version 1.0
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/{index}")
    public String toPage(@PathVariable("index") String index){
        return index;
    }
    
}
