package structuralpattern.template;

public class Zmain {
    /**
     * 模板模式：
     * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
     *
     * 优点：
     * 1、封装不变部分，扩展可变部分。
     * 2、提取公共代码，便于维护。
     * 3、行为由父类控制，子类实现。
     *
     * 缺点：
     * 每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
     *
     */
    public static void main(String[] args) {
        MybatisTemplate mybatisTemplate = new MybatisTemplate();
//        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        mybatisTemplate.getUser();
    }
}