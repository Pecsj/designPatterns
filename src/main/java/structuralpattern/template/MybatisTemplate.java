package structuralpattern.template;

public class MybatisTemplate extends OrmTemplate{
    @Override
    protected boolean linkMysql() {
        System.out.println("使用mybatis....");
        return true;
    }

    @Override
    protected boolean closeSession() {
        return true;
    }
}
