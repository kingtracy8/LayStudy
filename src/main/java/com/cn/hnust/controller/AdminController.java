package com.cn.hnust.controller;

import com.cn.hnust.domain.Admin;
import com.cn.hnust.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by trcay on 2017/10/28.
 */

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    IAdminService adminService;

    @RequestMapping(value = "/printAdmin")
    public String print(){
        List<Admin> admins = new ArrayList<Admin>();
        admins = adminService.selectUserAdmins();
        for (int i = 0; i < admins.size(); i++) {
            System.out.println(admins.get(i).getId()+","+admins.get(i).getAdminName()+","+admins.get(i).getPassword());
        }
        return "error";
    }

    @RequestMapping(value = "/ShowAdmins")
//    public @ResponseBody Admin showAdmins(){
    public @ResponseBody HashMap showAdmins(){
        List<Admin> admins = new ArrayList<Admin>();
        admins = adminService.selectUserAdmins();
        HashMap s = new HashMap();
        s.put("code", 0);
        s.put("msg", "");
       // s.put("count",100);
       // return admins.get(0);
        s.put("data",admins);
        return s;
    }

}
