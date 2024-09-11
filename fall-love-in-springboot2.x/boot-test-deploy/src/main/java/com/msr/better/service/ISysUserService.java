package com.msr.better.service;

import com.msr.better.domain.SysUser;

import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-08-04 00:30:29
 */
public interface ISysUserService {

    List<SysUser> listAll();

    SysUser insert(SysUser user);

    SysUser findById(Long id);
}
