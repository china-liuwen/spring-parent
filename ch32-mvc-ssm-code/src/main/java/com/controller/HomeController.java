package com.controller;

import com.entity.EmployeeEntity;
import com.github.pagehelper.PageInfo;
import com.service.EmployeeService;
import com.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public ResponseVO list(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,

            @RequestParam(value = "pageSize",defaultValue = "1",required = false)int pageSize){

        PageInfo pageInfo = new PageInfo(employeeService.getAll(pageNum,3));
        ResponseVO vo = ResponseVO.newBuilder().code("200").data(pageInfo).msg("ok").build();
        return vo;
    }
}




















