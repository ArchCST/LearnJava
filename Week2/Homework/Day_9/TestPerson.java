package Week2.Homework.Day_9;

import javax.naming.Name;

public class TestPerson {
    public static void main(String[] args) {
        Person P = new Person();
        P.setName("老王");
        P.setAge(141);
        P.setSex('公');
        P.setId("510101190001010001");
        P.setAddress("隔壁");

        System.out.println(
                "Name: "+P.getName()+" "+
                "Age: "+P.getAge()+" "+
                "Sex: "+P.getSex()+" "+
                "Id: "+P.getId()+" "+
                "Address: "+P.getAddress()
        );
    }
}
