package Week2.Homework.Day_11.liaoxuefeng;

public class FinalNameChange extends FinalName{
    public final String name1;
    public FinalNameChange(String name) {
        super(name);
        this.name1 = name;
    }

    public static void main(String[] args) {
        FinalNameChange finalNameImplements = new FinalNameChange("new name");
        System.out.println(finalNameImplements.name);

    }
}
