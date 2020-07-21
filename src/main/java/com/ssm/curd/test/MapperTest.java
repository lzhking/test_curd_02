package com.ssm.curd.test;

import com.ssm.curd.bean.Department;
import com.ssm.curd.bean.Employee;
import com.ssm.curd.dao.DepartmentMapper;
import com.ssm.curd.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){

        System.out.println(departmentMapper);

        departmentMapper.insertSelective(new Department(null,"人资部"));
        departmentMapper.insertSelective(new Department(null,"开发部"));

        //employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@qq.com",1));

        /*EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i=0;i<1000;i++){
            String uid=UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",1));
        }
        System.out.println("批量完成");*/
    }
}
