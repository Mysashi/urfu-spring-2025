package com.example.urfu_spring.task_04.controller;


import com.example.urfu_spring.task_04.dto.GoodsJsonDto;
import com.example.urfu_spring.task_04.service.GoodsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JSONController {

    private GoodsService goodsService;

    public JSONController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }


    @RequestMapping(
            value = "goods",
            method = RequestMethod.POST)
    public ResponseEntity<GoodsJsonDto> getData(@RequestBody String payload) {
        GoodsJsonDto goods = goodsService.parseJson(payload);
        goods.getInfo().setId(123);
        return new ResponseEntity<GoodsJsonDto>(goods, HttpStatus.OK);
    }
}
