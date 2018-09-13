package com.dao;

import com.jopo.TUserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml"})
public class UserDaoTest {
@Autowired
UserDao  userDao;
   // @Test
    public void selectByPrimaryKey() {
        TUserEntity tUserEntity = userDao.selectByPrimaryKey(2);
        System.out.println(tUserEntity);
    }

   // @Test
    public void getObjects() {
        List<TUserEntity> userEntityList = userDao.getObjects(TUserEntity.class);
        System.out.println(userEntityList);
    }

 //   @Test
    public void deleteById() {
        userDao.deleteById(TUserEntity.class,6);
    }

   @Test
    public void update() {
        TUserEntity tUserEntity = userDao.selectByPrimaryKey(6);
        tUserEntity.setAge(20);
        userDao.update(tUserEntity);
    }

  // @Test
    public void save() {
        TUserEntity jack = new TUserEntity();
        jack.setAge(15);
        jack.setName("jack");
        userDao.save(jack);
    }
}