package com.learn.gmall.usermanage;


import com.learn.gmall.bean.UserInfo;
import com.learn.gmall.service.UserInfoService;
import com.learn.gmall.usermanage.sercice.impl.UserInfoServiceImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUsermanageApplicationTests {



    @Test
    @Transactional
    public void contextLoads() {
        UserInfoService userInfoService= new UserInfoServiceImpl();
        List<UserInfo> userInfoList=userInfoService.getUserInfoList();
        System.out.println(userInfoList);
    }

}
