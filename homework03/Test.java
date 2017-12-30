package homework03;

class Test{
    public static void main(String[] args) {
        Pig pig = new Pig("白色",10,100,0.8);
        pig.show();
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("戴尔","intel I5 8GB 1TB GTX1070","China",5000);
        computer1.show();
        computer2.show();
        Student stu1 = new Student("小红","女",20,180,50,"大一","6班");
        Student stu2 = new Student("小白","男",22,180,70,"大三","9班");
        stu1.dinner();
        System.out.println(stu1.getWeight());
        stu1.walk();
        System.out.println(stu1.getWeight());
    }
}
