package com.zhoujian.dubbo.service;

import com.zhoujian.pojo.Emp;

import java.util.List;

public interface EmpDubboService {
    public int insertEmp(Emp emp);

    public List<Emp> findEmpByDeptId(Integer did);
}
