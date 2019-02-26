package com.SSM.service.impl;

import com.SSM.dao.SysUserMapper;
import com.SSM.domain.SysUser;
import com.SSM.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService {

    private SysUserMapper sysUserMapper;

    @Autowired
    public void setSysUserMapper(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public SysUser findSysUserById(String id) {
        return this.sysUserMapper.findSysUserById(id);
    }

    @Override
    public List<SysUser> findAllUser() {
        return this.sysUserMapper.findAllUser();
    }
}
