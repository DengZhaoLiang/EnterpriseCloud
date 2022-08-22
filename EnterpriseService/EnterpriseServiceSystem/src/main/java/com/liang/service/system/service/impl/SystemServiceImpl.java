package com.liang.service.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liang.common.exception.BusinessException;
import com.liang.service.system.entity.System;
import com.liang.service.system.mapper.SystemMapper;
import com.liang.service.system.service.ISystemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SystemServiceImpl implements ISystemService {

    private final SystemMapper systemMapper;

    @Override
    public List<System> list() {
        return systemMapper.list();
    }

    @Override
    public Page<System> page() {
        Page<System> page = new Page<>(1, 1);
        List<System> records = systemMapper.page(page);
        page.setRecords(records);
        return page;
    }

    @Override
    public String exception() {
        throw new BusinessException("自定义异常");
    }
}