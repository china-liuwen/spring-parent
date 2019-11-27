package com.dao;

import com.entity.UserinfoEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoDao {

    void delete();

    List<UserinfoEntity> getAll(@Param("pageNum")int pageNum, @Param("pageSize")int pageSize);

}
