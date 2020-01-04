package Week3.Lessons.Day_20.customException;

import Week2.Lessons.Day_12.Food.Noodle;

/*
一般继承 runtimeException，继承 Exception 会自动抛出
 */
public class NoAgeException extends Exception{
    public NoAgeException() {
        super();
    }

    public NoAgeException(String str) {
        super("年龄 "+str+" 值非法异常");
    }
}
