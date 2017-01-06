/**
 *  Copyright (c) 2012-2013 http://www.afeng.framework.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 */
/**
 *  Copyright (c) 2012-2014 http://www.afeng.framework.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.afeng.business.system.log.controller;

import com.afeng.common.model.Combobox;
import com.afeng.common.model.Result;
import com.afeng.common.controller.BaseController;
import com.afeng.common.service.BaseService;
import com.afeng.common.utils.StringUtils;
import com.afeng.common.utils.web.SelectType;
import com.afeng.business.system.log._enum.LogType;
import com.afeng.business.system.log.entity.Log;
import com.afeng.business.system.log.service.LogService;
import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 日志
 *
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2013-12-8 下午5:13
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/log")
public class LogController
        extends BaseController<Log,Long> {

    @Autowired
    private LogService logService;

    @Override
    public BaseService<Log, Long> getEntityManager() {
        return logService;
    }

    @RequestMapping(value = {""})
    public String list() {
        return "business/system/log/log";
    }

    /**
     * 清空所有日志
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"removeAll"})
    @ResponseBody
    public Result removeAll() throws Exception {
    	logService.removeAll();
        Result result = Result.successResult();
        return result;
    }

    /**
     * 日志类型下拉列表.
     */
    @RequestMapping(value = {"logTypeCombobox"})
    @ResponseBody
    public List<Combobox> logTypeCombobox(String selectType) throws Exception {
        List<Combobox> cList = Lists.newArrayList();
        //为combobox添加  "---全部---"、"---请选择---"
        if (!StringUtils.isBlank(selectType)) {
            SelectType s = SelectType.getSelectTypeValue(selectType);
            if (s != null) {
                Combobox selectCombobox = new Combobox("", s.getDescription());
                cList.add(selectCombobox);
            }
        }

        LogType[] lts = LogType.values();
        for (int i = 0; i < lts.length; i++) {
            Combobox combobox = new Combobox();
            combobox.setValue(lts[i].getValue().toString());
            combobox.setText(lts[i].getDescription());
            cList.add(combobox);
        }
        return cList;
    }


}
