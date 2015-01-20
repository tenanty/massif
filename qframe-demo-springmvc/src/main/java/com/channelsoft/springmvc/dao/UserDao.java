package com.channelsoft.springmvc.dao;

import com.channelsoft.springmvc.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 实现PagingAndSortingRepository接口
 * Created by yuanshun on 2015/1/19.
 */
public interface UserDao extends PagingAndSortingRepository<User, Long> {

}
