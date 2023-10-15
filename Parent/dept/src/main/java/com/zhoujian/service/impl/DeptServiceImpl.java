package com.zhoujian.service.impl;

import com.zhoujian.dubbo.service.DeptDubboService;
import com.zhoujian.dubbo.service.EmpDubboService;
import com.zhoujian.pojo.Dept;
import com.zhoujian.pojo.Emp;
import com.zhoujian.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Reference
    private DeptDubboService deptDubboService;

    @Reference
    private EmpDubboService empDubboService;

    @Override
    public List<Dept> findAll() {

        return deptDubboService.findAllDept();
    }

    @Override
    public List<Emp> findEmpByDeptId(Integer did) {
        return empDubboService.findEmpByDeptId(did);
    }
}
