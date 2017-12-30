package homework03;

/*
* 1、 写一个传奇游戏中的猪类， 类中有属性： 颜色、 个头、 攻击力、 准确度。
* 有一个展示猪信息的方法。 再写一个测试类， 生成一个猪的对象， 将此猪的颜色值为“白色”，
* 个头为5厘米， 攻击力为50点血， 准确度为0.8。 要求输出此猪的信息格式为： 一只白色的猪，
* 个头5厘米， 攻击为为50点血， 准确度为0.8， 我好怕怕呀
* */
public class Pig {
    private String color;
    private int size;
    private int attack;
    private double accuracy;

    public Pig(){}

    public Pig(String color, int size, int attack, double accuracy){
        this.color    = color;
        this.size     = size;
        this.attack   = attack;
        this.accuracy = accuracy;
    }

    public void show(){
        System.out.println("一只"+getColor()+"的猪，个头"+getSize()+"厘米，攻击力为"+
        getAttack()+"点血，准确度为"+getAccuracy()+"我好怕怕啊");
    }



    /*set get------------------------------------------------------------*/
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getAttack() {
        return attack;
    }

    public double getAccuracy() {
        return accuracy;
    }

}

/*
* 2、 定义 computer 计算机类：
a、 包含属性： 品牌 brand； 型号 type ; 如 INTER i3 INTER i5 AMD六核。 。 。 ； 产地madeIn ； 价格 price。
b、 包含方法： public void show(){ }显示所有的属性值。
c： 定义类时就给属性设置初始值： 联想、T400 INTER 双核、 中国、 7000.00元。
d： 在测试类中创建对象 并调用show方法显示信息。
e： 然后修改这个对象每个属性的值： DELL、 inter i5、 美国、 8000.00元。
f： 再次调用show方法显示属性的值。

*
* */
