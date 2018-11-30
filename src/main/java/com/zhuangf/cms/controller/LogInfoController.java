package com.zhuangf.cms.controller;

import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.cms.service.LogInfoService;
import com.zhuangf.frame.base.controller.BaseController;
import com.zhuangf.frame.base.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logInfo")
@Api(value = "LogInfo" ,tags = {"日志管理接口"})
public class LogInfoController extends BaseController {

    @Autowired
    LogInfoService logInfoService;

    @ApiOperation(value = "queryById",notes = "根据ID查询数据")
	@GetMapping("/{id}")
	public Result queryById(@PathVariable("id") String id) {
		return Result.successWithCode().setData(logInfoService.queryById(id));
	}

    @ApiOperation(value = "insertLogInfo",notes = "插入日志")
    @PostMapping
    public Result insertLogInfo(LogInfo logInfo) {
        return  Result.successWithCode().setData(logInfoService.insert(logInfo));
    }
}
