package com.zhoujian.service;

import com.zhoujian.pojo.Dept;
import com.zhoujian.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EmpService {
    public List<Dept> showAll();

    public int insert(Emp emp, MultipartFile file);

}
