package com.cn.hnust.service;

import com.cn.hnust.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by trcay on 2017/10/28.
 */
public interface IAdminService {
    public List<Admin> selectUserAdmins();
    public Admin getAdminById(int adminId);
    public int deleteByPrimaryKey(int adminId);
}
