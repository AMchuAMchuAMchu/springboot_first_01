package com.itheima.controller;

import com.itheima.pojo.AnimeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_first_01
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-18 09:24:12
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {



    @GetMapping("/{id}")
    public AnimeInfo selectById(Integer id){

    }

}
