package homework03;
/*
3、 使用JAVA定义学生类Student：
a.要求学生类有姓名、 性别、 年龄、 身高,体重 分数， 班级Class等属性
b.提供： 自我介绍显示所有属性的值： 我是XX班的一名男同学， 今年XX岁，
    身高： XXX， 体重XXX， 今年考了XX分。
c.提供dining() 吃饭 和walk()走路的方法： 吃饭： 显示 我在吃饭，
    然后体重增加1； 走路： 显示 我在走路， 然后体重减少1。
d. 编写测试类Teststudent进行测试：
    创建2个Student对象的对象： stu1 与 stu2， 分别为两个对象的属性赋值，
    再分别调用对象的dining(),walk()方法， 看看输出是否正确?

 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private double height;
    private double weight;
    private String grade;
    private String classNum;

    public Student(){}

    public Student(String name, String sex, int age, double height, double weight, String grade, String classNum) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setGrade(grade);
        this.setClassNum(classNum);
    }

    /*方法*/
    /*自我介绍*/
    public void introduce(){
        System.out.println("大家好，我是" + getName() + "今年" + getAge() + "岁，身高" + getHeight() + "厘米，体重"
            + getWeight() + "公斤，" + "读" + getGrade() + "年纪" + getClassNum() + "班");
    }
    /*dinner方法*/
    public void dinner(){
        this.weight++;
    }
    public void walk(){
        this.weight--;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
