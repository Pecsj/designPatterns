package structuralpattern.template;

public class HibernateTemplate extends OrmTemplate{
    @Override
    protected boolean linkMysql() {
        System.out.println("使用hibernate...");
        return true;
    }

    @Override
    protected boolean closeSession() {
        return true;
    }
}
