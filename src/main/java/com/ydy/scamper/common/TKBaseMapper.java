package com.ydy.scamper.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by yoyo on 2019/7/24.
 */
public interface TKBaseMapper<T> extends Mapper<T>, MySqlMapper<T>{
}
