package com.test;

import com.ndktools.javamd5.core.MD5;

public class Md5 {
  public static void main(String[] args) {
    String s ="abcdefg1"+"123";
    MD5 md5 =new MD5();
    System.out.println( md5.getMD5ofStr(s));
}
}
