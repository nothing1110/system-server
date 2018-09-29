package com.zhuangf.cms.model;

import javax.persistence.*;

/**
 * @author: zhuangf
 * @description: 系统日志
 * @create: 2018-09-27 14:37
 **/
//JPA的注解
@Table(name = "t_sys_log")
public class LogInfo {
    @Id
    @Column(name="id")
    private String id;
    //访问用户ID
    @Column(name="user_id")
    private String userId;
    //访问地址
    @Column(name="request_uri")
    private String requestUri;
    //访问ip
    @Column(name="ip")
    private String ip;
    //访问时间
    @Column(name="create_time")
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", ip='" + ip + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
