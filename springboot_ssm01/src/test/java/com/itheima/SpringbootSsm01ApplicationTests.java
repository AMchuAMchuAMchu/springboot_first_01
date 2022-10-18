package com.itheima;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsm01ApplicationTests {


    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Test
    void contextLoads() {

        AnimeInfo animeInfo = new AnimeInfo();
        animeInfo.setName("yyyy");
        animeInfo.setCharacter01("78787");
        animeInfo.setCharacter02("8787");
        animeInfo.setId(990);
        animeInfo.setReleaseTime(2022);
        animeInfoDao.insert(animeInfo);

    }

}
