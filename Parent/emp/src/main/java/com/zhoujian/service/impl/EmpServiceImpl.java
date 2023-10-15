package com.zhoujian.service.impl;

import com.zhoujian.dubbo.service.DeptDubboService;
import com.zhoujian.dubbo.service.EmpDubboService;
import com.zhoujian.pojo.Dept;
import com.zhoujian.pojo.Emp;
import com.zhoujian.service.EmpService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class EmpServiceImpl implements EmpService {

    @Reference
    private DeptDubboService deptDubboService;

    @Reference
    private EmpDubboService empDubboService;

    @Override
    public List<Dept> showAll() {
        return deptDubboService.findAllDept();
    }

    @Override
    public int insert(Emp emp, MultipartFile file) {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).
                    getRequest();
            String path = request.getServletContext().getRealPath("/img");
            System.out.println("path ==" + path);

            long currentTimeMills = System.currentTimeMillis();
            Random random = new Random();
            String filePath = currentTimeMills + "" + random.nextInt(1000);
            String oldName = file.getOriginalFilename();
            filePath += oldName.substring(oldName.lastIndexOf("."));

            File pathFile = new File(path);

            if (!pathFile.exists()){
                pathFile.mkdirs();
            }

            file.transferTo(new File(path, filePath));
            emp.setPhoto("http://localhost:8081/img/"+filePath);

            return empDubboService.insertEmp(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return 0;
    }

}


