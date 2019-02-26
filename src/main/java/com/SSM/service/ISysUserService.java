package com.SSM.service;

import com.SSM.domain.SysUser;

import java.util.List;

public interface ISysUserService {
    public SysUser findSysUserById(String id);

    public List<SysUser> findAllUser();

}
