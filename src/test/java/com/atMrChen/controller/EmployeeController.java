package com.atMrChen.controller;

import com.atMrChen.pojo.Employee;
import com.atMrChen.pojo.Msg;
import com.atMrChen.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @ResponseBody
    @GetMapping("/emps")
    public Msg getEmpsWithJson(@RequestParam(value = "page", defaultValue = "1") int page,
                               @RequestParam(value = "rows", defaultValue = "10") int rows) {

        return null;
    }
}
