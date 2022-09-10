package com.atMrChen.controller;

import com.atMrChen.pojo.Employee;
import com.atMrChen.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
    private static final String PAGE_LIST = "list";
    @Autowired
    private EmployeeService employeeService;

    /**
     * 分页查询员工数据
     * @param page 页码
     * @param rows 记录数
     * @return 转发至PAGE_LIST页面进行展示
     */
    @GetMapping("/emps")
    public String getEmps(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "rows", defaultValue = "10") int rows,
                          Model model) {
        PageInfo<Employee> pageInfo = employeeService.getEmps(page, rows);
        System.out.println(pageInfo);
        model.addAttribute("pageInfo", pageInfo);
        return PAGE_LIST;
    }
}
