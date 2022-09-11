package com.atMrChen.controller;

import com.atMrChen.pojo.Employee;
import com.atMrChen.pojo.Msg;
import com.atMrChen.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 分页查询员工数据
     * @param page 页码
     * @param rows 记录数
     * @return 转发至PAGE_LIST页面进行展示
     */
    @ResponseBody
    @GetMapping("/emps")
    public  Msg getEmpsWithJson(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "rows", defaultValue = "10") int rows) {
        PageInfo<Employee> pageInfo = employeeService.getEmps(page, rows);
        Msg msg = Msg.success();
        msg.add("pageInfo", pageInfo);

        return msg;
    }

}
