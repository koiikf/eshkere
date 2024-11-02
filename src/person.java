/**
 * класс <b style="background: red; font-size: 2em">человек</b>
 * @author я
 * @version z
 */
public class person{
    /** никнейм */
    public String name;
    /** количество лет, прожитых данной персоной на планете земля с момента появления на свет */
    public int age;
    /**
     * конструктор класса
     * @param name имечко
     * @param age количество лет, прожитых данной персоной на планете земля с момента появления на свет
     */
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    /**
     * отображение инфы о данной персоне
     */
    public void display(){
        System.out.println("погоняло: " + name + "\nвозраст: " + age + "\n");
    }
}