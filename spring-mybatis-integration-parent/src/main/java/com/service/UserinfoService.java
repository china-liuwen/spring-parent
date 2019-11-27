package com.service;


import com.entity.UserinfoEntity;

import java.util.List;

public interface UserinfoService {

    List<UserinfoEntity> getAll(int pageNum,int pageSize);

    void txDemo();
}
