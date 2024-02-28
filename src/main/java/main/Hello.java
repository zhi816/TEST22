package main;


public class Hello {
    public static void main(String[] args){//快速main直接取名子
        System.out.println("Hello");//快速sout

        new Person().hello();//將類別生出來產生物件new Person，即可使用物件中的方法
        Person p = new Person();
        p.hello();//同理
    }
}
