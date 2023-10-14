package com.zhoujian.service.impl;

import com.zhoujian.dubbo.service.DeptDubboService;
import com.zhoujian.pojo.Dept;
import com.zhoujian.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAll() {

        return deptDubboService.findAllDept();
    }
}
