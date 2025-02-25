package Java_OOPS;
class Children{
    String name;
    static String school;      //static - constant or common
    public static void changeSchool(){
        school = "newSchool";
    }
}

public class Static {
    public static void main(String[] args){
        Children.school = "Indrali";
        Children child = new Children();
        child.name = "Raksha";
        System.out.println(child.school);

    }

}
