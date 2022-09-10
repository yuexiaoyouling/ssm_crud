package com.atMrChen.mapper;

import com.atMrChen.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void insert() {
        for (int i = 0; i < 100 ; i++) {
            String str = getRandomStr();
            String str1=str+"@qq.com";
            System.out.println(str1);
            if(i%3==0||i%4==0){
                Employee employee = new Employee(null, str, 1, str1, 1);
                employeeMapper.insert(employee);
            }else if(i%5==0||i%2==0){
                Employee employee = new Employee(null, str, 2, str1, 3);
                employeeMapper.insert(employee);
            }else{
                Employee employee = new Employee(null, str, 1, str1, 2);
                employeeMapper.insert(employee);
            }

        }

    }
    private static String getRandomStr() {

        /* 声明并赋值 按顺序保存 a b c ……26个英文字母 */

        char[] ch_arr = new char[26];
        for (int i = 0; i <ch_arr.length ; i++) {
            ch_arr[i]=(char)('a'+i);
        }
        /* 利用洗牌算法，打乱数组ch_arr */
        for(int i=0;i<ch_arr.length;i++){


            int index = (int) (Math.random() * (ch_arr.length - 1));
            char t=ch_arr[index];
            ch_arr[index]=ch_arr[ch_arr.length-1-i];
            ch_arr[ch_arr.length-1-i]=t;
        }

        return new String(ch_arr).substring(0,1).toUpperCase()+new String(ch_arr).substring(1,4);

    }
}
