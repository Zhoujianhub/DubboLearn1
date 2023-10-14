package com.zhoujian.dubbo.service.impl;

import com.zhoujian.dubbo.service.DeptDubboService;
import com.zhoujian.mapper.DeptMapper;
import com.zhoujian.pojo.Dept;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DeptDubboServiceImpl implements DeptDubboService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAll();
    }
}
