package structuralpattern.chain;

/**
 * @Author csj
 * @Description: 二级管理者：可处理二级及以下等级消息
 * @Date 2021/6/2
 */
public class TwoManger implements Handler{

    @Override
    public Boolean process(Request request) {
        if(request.getLeavel() >= 2){
            System.out.println("TwoManger处理:"+request.getMsg());
            return true;
        }
        return null;
    }
}
