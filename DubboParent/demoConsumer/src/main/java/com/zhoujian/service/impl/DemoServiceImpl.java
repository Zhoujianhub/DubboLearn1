package com.zhoujian.service.impl;

import com.zhoujian.dubbo.service.DemoDubboService;
import com.zhoujian.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class DemoServiceImpl implements DemoService {

    @Reference
    private DemoDubboService demoDubboService;

    @Override
    public String demo() {

        return demoDubboService.demo("张三丰");
    }
}
