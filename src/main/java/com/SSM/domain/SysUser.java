package com.SSM.domain;

import org.apache.ibatis.type.Alias;

@Alias("sysUser")
public class SysUser {
    private String id;
    private String userName;
    private String userTrueName;
    private String deleteFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTrueName() {
        return userTrueName;
    }

    public void setUserTrueName(String userTrueName) {
        this.userTrueName = userTrueName;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
