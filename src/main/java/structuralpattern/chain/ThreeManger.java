package structuralpattern.chain;

/**
 * @Author csj
 * @Description: 三级管理者，处理三级及三级以下消息
 * @Date 2021/6/2
 */
public class ThreeManger implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getLeavel() >= 3){
            System.out.println("ThreeManger处理:"+request.getMsg());
            return true;
        }
        return null;
    }
}
