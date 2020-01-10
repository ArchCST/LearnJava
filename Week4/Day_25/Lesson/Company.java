package Week4.Day_25.Lesson;

import java.util.Objects;

/*
xxx竞拍公司投标系统，现在有100家公司来投标，但是其中有可能出现重复投标公司，
请选择符合条件的集合去存储这些公司的信息。
当标书的公司名称+编号完全相同时认为是同一家公司
公司的属性为：名字+公司编号
自定义5个公司存进HashSet集合
 */
public class Company {
    public static void main(String[] args) {
        hello("Hello how are you");
    }

    private static void hello(String hello) {
        System.out.println(hello);
    }


    private String id;
    private String name;

    public Company() {
    }

//    @Override
//    public int hashCode() {
//        return name.hashCode()+id.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        } else if (obj instanceof Company) {
//            Company c = (Company) obj;
//            return this.name.equals((c.name)) && this.id.equals(c.id);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Company company = (Company) object;
        return Objects.equals(id, company.id) &&
                Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Company(String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
