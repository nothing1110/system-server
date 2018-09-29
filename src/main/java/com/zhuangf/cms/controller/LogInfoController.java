package com.zhuangf.cms.controller;

import com.zhuangf.cms.model.LogInfo;
import com.zhuangf.cms.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logInfo")
public class LogInfoController {
    @Autowired
    LogInfoService logInfoService;

	@GetMapping("/{id}")
	public LogInfo queryById(@PathVariable("id") String id) {
		return logInfoService.queryById(id);
	}
}
