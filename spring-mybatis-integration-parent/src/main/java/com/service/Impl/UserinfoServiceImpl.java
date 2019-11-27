package com.service.Impl;

import com.dao.UserinfoDao;
import com.entity.UserinfoEntity;
import com.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoDao userinfoDao;

    @Override
    public List<UserinfoEntity> getAll(int pageNum, int pageSize) {
        return userinfoDao.getAll(pageNum,pageSize);
    }

    @Override
    public void txDemo() {
        userinfoDao.delete();
    }
}
