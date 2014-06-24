package com.test;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class Md5s{
public static  String Md5(String msg){
    try {
     MessageDigest md = MessageDigest.getInstance("md5");
     System.out.println("------------"+md);
     byte md5[] = md.digest(msg.getBytes());
     BASE64Encoder encoder = new BASE64Encoder();
     return encoder.encode(md5);//解释md5码成明文字符串
    } catch (Exception e) {
     throw new RuntimeException(e);
    }
    
   }
public static void main(String[] args) {
    Md5s d =new Md5s();
    System.out.println(d.Md5("123sssss"));
}
}