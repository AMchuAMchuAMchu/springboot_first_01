package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.AnimeInfoDao;
import com.itheima.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisPlus01ApplicationTests {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    @Test
    void textPage(){

        Page<AnimeInfo> animeInfoPage = new Page<>(1, 4);

        Page<AnimeInfo> animeInfoPage1 = animeInfoDao.selectPage(animeInfoPage, null);


        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(animeInfoPage1.getRecords());

    }

    @Test
    void contextLoads() {

        List<AnimeInfo> animeInfos = animeInfoDao.selectList(null);

        animeInfos.forEach(System.out::println);

    }

}
