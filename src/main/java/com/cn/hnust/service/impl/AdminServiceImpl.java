package com.cn.hnust.service.impl;

import com.cn.hnust.IDao.AdminMapper;
import com.cn.hnust.domain.Admin;
import com.cn.hnust.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by trcay on 2017/10/28.
 */
@Service("adminService")
public class AdminServiceImpl implements IAdminService{

    //@Resource
    @Autowired
    AdminMapper adminMapper;

    public List<Admin> selectUserAdmins() {
        return adminMapper.selectUserAdmins();
    }


    public Admin getAdminById(int adminId) {
        return this.adminMapper.selectByPrimaryKey(adminId);
    }
}
