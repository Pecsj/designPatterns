package structuralpattern.chain;

/**
 * @Author csj
 * @Description: 最高管理者,可处理1及1及以下消息
 * @Date 2021/6/2
 */
public class OneManger implements Handler{
    @Override
    public Boolean process(Request request) {
        if(request.getLeavel() >= 1){
            System.out.println("OneManger处理:"+request.getMsg());
            return true;
        }
        return null;
    }
}
