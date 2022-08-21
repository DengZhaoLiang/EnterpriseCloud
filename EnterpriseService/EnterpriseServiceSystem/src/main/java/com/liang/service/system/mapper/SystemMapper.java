package com.liang.service.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liang.service.system.entity.System;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemMapper {

    List<System> list();

    List<System> page(Page<System> page);
}