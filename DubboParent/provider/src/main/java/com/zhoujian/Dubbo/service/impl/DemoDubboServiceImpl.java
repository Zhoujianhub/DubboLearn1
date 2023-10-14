package com.zhoujian.Dubbo.service.impl;

import com.zhoujian.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoDubboServiceImpl implements DemoDubboService {

    @Override
    public String Demo(String params) {
        System.out.println("执行demo ...");
        return params+"123";
    }
}
