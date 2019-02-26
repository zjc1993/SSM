package com.SSM.controller;

import com.SSM.constants.CommonConstants;
import com.SSM.domain.SysUser;
import com.SSM.service.ISysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;


    @RequestMapping("/findSysUserById.do")
    public String findSysUserById(HttpServletRequest request, Model model) {
        String id = request.getParameter(CommonConstants.ID);
        SysUser sysUser = sysUserService.findSysUserById(id);
        model.addAttribute("user", sysUser);
        return "sysUser";
    }

    @RequestMapping("/findAllUser.do")
    public String findAllUser(Model model) {
        List<SysUser> sysUsers = sysUserService.findAllUser();
        model.addAttribute("allSysUser", sysUsers);
        return "sysUser";
    }
}
