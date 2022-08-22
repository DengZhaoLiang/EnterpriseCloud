package com.liang.service.system.controller;

import com.liang.common.entity.Result;
import com.liang.service.system.Dto.SystemDTO;
import com.liang.service.system.service.ISystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/system")
@AllArgsConstructor
@Api(tags = "EnterpriseServiceSystem")
public class SystemController {

    private final ISystemService systemService;

    @GetMapping(value = "/list")
    @ApiOperation(value = "system list接口")
    public Object list() {
        return systemService.list();
    }

    @GetMapping(value = "/page")
    @ApiOperation(value = "system page接口")
    public Object page() {
        return systemService.page();
    }

    @GetMapping(value = "exception")
    @ApiOperation(value = "自定义异常及返回测试接口")
    public Result<String> exception() {
        return Result.data(systemService.exception());
    }

    @PostMapping(value = "valid")
    @ApiOperation(value = "参数校验测试接口")
    public Result<SystemDTO> valid(@Valid @RequestBody SystemDTO systemDTO) {
        return Result.data(systemDTO);
    }
}
