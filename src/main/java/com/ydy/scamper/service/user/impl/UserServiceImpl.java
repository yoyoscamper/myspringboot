package com.ydy.scamper.service.user.impl;

import com.ydy.scamper.common.MyConstant;
import com.ydy.scamper.dao.UserMapper;
import com.ydy.scamper.model.user.User;
import com.ydy.scamper.model.user.UserParam;
import com.ydy.scamper.service.user.IUserService;
import com.ydy.scamper.utils.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by yoyo on 2019/7/24.
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(UserParam userParam) {

        User user = new User();
        BeanUtils.copyProperties(userParam,user);
        if(StringUtils.isNotBlank(user.getId())){
            user.setId(UUIDUtil.CreateUUID());
            user.setRecordStatus(MyConstant.EXIST);
            userMapper.insertSelective(user);
        }
        return 0;
    }
}
