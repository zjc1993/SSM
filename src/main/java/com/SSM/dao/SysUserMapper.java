package com.SSM.dao;

import com.SSM.domain.SysUser;

import java.util.List;

public interface SysUserMapper {
    public SysUser findSysUserById(String id);

    public List<SysUser> findAllUser();
}
