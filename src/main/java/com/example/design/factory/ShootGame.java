package com.example.design.factory;

/**
 * @auther: chenmingyu
 * @date: 2019/2/14 11:26
 * @description: 射击类游戏
 */
public class ShootGame implements Gameable{

    @Override
    public void validateAccount(String nickName) {
        System.out.println("射击游戏校验昵称："+nickName);
    }
}
