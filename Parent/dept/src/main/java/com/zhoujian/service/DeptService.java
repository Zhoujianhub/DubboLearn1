package com.zhoujian.service;

import com.zhoujian.pojo.Dept;
import com.zhoujian.pojo.Emp;

import java.util.List;

public interface DeptService {

    public List<Dept> findAll();

    public List<Emp> findEmpByDeptId(Integer did);
}
