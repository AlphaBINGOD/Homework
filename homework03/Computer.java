package homework03;
/*
2、 定义 computer 计算机类：
a、 包含属性： 品牌 brand； 型号 type ; 如 INTER i3 INTER i5 AMD六核。 。 。 ；
    产地madeIn ； 价格 price。
b、 包含方法： public void show(){ }显示所有的属性值。
c： 定义类时就给属性设置初始值： 联想、T400 INTER 双核、 中国、 7000.00元。
d： 在测试类中创建对象 并调用show方法显示信息。
e： 然后修改这个对象每个属性的值： DELL、 inter i5、 美国、 8000.00元。
f： 再次调用show方法显示属性的值。

 */
public class Computer {

    private String brand  = "联想";
    private String type   = "intel I7 16Gb 1Tb GTX1080";
    private String madeIn = "USA";
    private double price  = 8000;

    public Computer(){}

    public Computer(String brand, String type, String madeIn, double price){
        this.setBrand(brand);
        this.setType(type);
        this.setMadeIn(madeIn);
        this.setPrice(price);
    }

    public void show(){
        System.out.println("电脑品牌：" + getBrand()  + "\n"+
                            "型号："    + getType()   + "\n"+
                            "产地："    + getMadeIn() + "\n"+
                            "价格："    + getPrice());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
