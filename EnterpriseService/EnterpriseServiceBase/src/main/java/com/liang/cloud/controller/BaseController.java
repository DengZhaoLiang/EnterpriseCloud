package com.liang.cloud.controller;

import com.liang.cloud.dto.ApiSystemDTO;
import com.liang.cloud.feign.ISystemFeign;
import com.liang.common.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/base")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Api(tags = "EnterpriseServiceBase")
@RefreshScope
public class BaseController {

    private final ISystemFeign systemFeign;

    @GetMapping(value = "/api/by/id")
    @ApiOperation(value = "Fegin Get调用测试接口")
    public Result<Object> feginById(@RequestParam("id") Long id) {
        return Result.data(systemFeign.querySystemById(id));
    }

    @PostMapping(value = "/api/by/dto")
    @ApiOperation(value = "Fegin Post调用测试接口")
    public Result<Object> feginByDto(@Valid @RequestBody ApiSystemDTO systemDTO) {
        return Result.data(systemFeign.querySystemByDto(systemDTO));
    }

}