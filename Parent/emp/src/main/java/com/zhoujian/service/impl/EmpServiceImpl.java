package com.zhoujian.service.impl;

import com.zhoujian.dubbo.service.DeptDubboService;
import com.zhoujian.pojo.Dept;
import com.zhoujian.service.EmpService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> showAll() {
        return deptDubboService.findAllDept();
    }
}
