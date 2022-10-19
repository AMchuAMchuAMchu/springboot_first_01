package com.itheima.service;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_first_01
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-18 09:25:50
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
@Transactional
public class AnimeInfoService {

    @Autowired
    private AnimeInfoDao animeInfoDao;

    public boolean insertOne(AnimeInfo animeInfo){
        int insert = animeInfoDao.insert(animeInfo);
        return insert>0;
    }

    public boolean deleteById(Integer id){
        int i = animeInfoDao.deleteById(id);
        return i>0;
    }

    public boolean updateById(AnimeInfo animeInfo){
        int i = animeInfoDao.updateById(animeInfo);
        return i>0;
    }

    public AnimeInfo selectById(Integer id){
        AnimeInfo animeInfo = animeInfoDao.selectById(id);
        return animeInfo;
    }

    public List<AnimeInfo> selectAll(){
        List<AnimeInfo> animeInfos = animeInfoDao.selectList(null);
        return animeInfos;
    }


}
