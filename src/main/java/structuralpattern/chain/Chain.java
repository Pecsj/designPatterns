package structuralpattern.chain;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author csj
 * @Description: 组装责任链
 * @Date 2021/6/2
 */
public class Chain {
    private ArrayList<Handler> handlerList;

    {
        handlerList = new ArrayList();
    }

    /**
     * @param 
     * @return structuralpattern.chain.Handler
     * @Author csj
     * @Description: 组装责任链
     * @Date 2021/6/2
     */
    public void addHander(Handler handler){
        handlerList.add(handler);
    }

    /**
     * @param
     * @return void
     * @Author csj
     * @Description: 处理消息
     * @Date 2021/6/2
     */
    public void work(Request request){
        for (Handler handler : handlerList) {
            Boolean key = handler.process(request);
            if(key == null){
                //给下一个处理
            }else if(key == true){
                //处理成功
                break;
            }else if (key == false){
                //拒绝处理
                System.out.println("该消息被驳回");
                break;
            }
            System.out.println("该消息被"+handler.getClass()+"传给下一级");
        }
    }

}
