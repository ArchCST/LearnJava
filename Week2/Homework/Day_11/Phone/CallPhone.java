package Week2.Homework.Day_11.Phone;

import Week2.Lessons.Day_11.compute.CallCompute;

public class CallPhone {
    public void giveACall(SmartPhone smartPhone){
        smartPhone.call();
    }

    public static void main(String[] args) {
        CallPhone callPhone = new CallPhone();
        callPhone.giveACall(new Apple());
        callPhone.giveACall(new HuaWei());
    }
}
