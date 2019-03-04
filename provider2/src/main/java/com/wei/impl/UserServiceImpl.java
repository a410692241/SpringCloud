package com.wei.impl;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import com.wei.dao.UserDao;
import com.wei.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public long countByExample(UserExample example) {
        return userDao.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        System.out.println("访问的是2++++++++++");
        return userDao.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userDao.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return userDao.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }
}
