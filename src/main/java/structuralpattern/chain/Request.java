package structuralpattern.chain;

/**
 * @Author csj
 * @Description: 消息对象
 * @Date 2021/6/2
 */
public class Request {
    private int leavel;
    private String msg;

    Request(int leavel,String msg){
        this.leavel = leavel;
        this.msg = msg;
    }

    public int getLeavel() {
        return leavel;
    }

    public String getMsg() {
        return msg;
    }
}
