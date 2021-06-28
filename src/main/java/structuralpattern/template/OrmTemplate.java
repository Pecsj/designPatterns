package structuralpattern.template;

public abstract class OrmTemplate {
    public final void getUser(){
        if(linkMysql()){
            System.out.println("数据库连接成功");
            System.out.println("查询到用户张三");
            if(closeSession()){
                System.out.println("关闭数据库成功");
            }
        }
    }

    protected abstract boolean linkMysql();
    protected abstract boolean closeSession();
}
