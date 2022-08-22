package com.liang.service.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liang.service.system.entity.System;

import java.util.List;

public interface ISystemService {

    List<System> list();

    Page<System> page();

    String exception();
}
