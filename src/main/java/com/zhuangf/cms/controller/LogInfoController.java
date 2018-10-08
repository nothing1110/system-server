package com.zhuangf.cms.controller;

import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.cms.service.LogInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logInfo")
@Api(value = "LogInfo" ,tags = {"日志管理接口"})
public class LogInfoController {
    @Autowired
    LogInfoService logInfoService;

    @ApiOperation(value = "queryById",notes = "根据ID查询数据")
	@GetMapping("/{id}")
	public LogInfo queryById(@PathVariable("id") String id) {
		return logInfoService.queryById(id);
	}

    @ApiOperation(value = "insertLogInfo",notes = "根据ID查询数据")
    @PostMapping
    public int insertLogInfo(LogInfo logInfo) {
        return logInfoService.insertLogInfo(logInfo);
    }
}
