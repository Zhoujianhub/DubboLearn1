package com.zhoujian.dubbo.service.impl;

import com.zhoujian.dubbo.service.EmpDubboService;
import com.zhoujian.mapper.EmpMapper;
import com.zhoujian.pojo.Emp;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmpDubboServiceImpl implements EmpDubboService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public int insertEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    @Override
    public List<Emp> findEmpByDeptId(Integer did) {
        return empMapper.findEmpByDeptId(did);
    }
}
