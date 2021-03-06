package com.weiran.gateway.manager.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weiran.gateway.manager.PermissionManager;
import com.weiran.gateway.mapper.PermissionMapper;
import com.weiran.gateway.model.PermissionDO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author Weiran
 * @since 2021-09-02
 */
@Service
public class PermissionManagerImpl extends ServiceImpl<PermissionMapper, PermissionDO> implements PermissionManager {

}
