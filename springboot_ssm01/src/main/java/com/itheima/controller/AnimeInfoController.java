package com.itheima.controller;

import com.itheima.domain.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @Autowired
    private AnimeInfoService animeInfoService;

    @PostMapping
    public String insertOne(@RequestBody AnimeInfo animeInfo){
        boolean b = animeInfoService.insertOne(animeInfo);
        return b?"true":"false";
    }

    @DeleteMapping("/{id}")
    public String dleteById(@PathVariable Integer id){
        boolean b = animeInfoService.deleteById(id);
        return b?"true":"false";
    }

    @PutMapping
    public String updateById(@RequestBody AnimeInfo animeInfo){
        boolean b = animeInfoService.updateById(animeInfo);
        return b?"true":"false";
    }

    @GetMapping("/{id}")
    public AnimeInfo selectById(@PathVariable Integer id){
        AnimeInfo animeInfo = animeInfoService.selectById(id);
        return animeInfo;
    }

    @GetMapping
    public List<AnimeInfo> selectAll(){
        List<AnimeInfo> animeInfos = animeInfoService.selectAll();
        return animeInfos;
    }







}
