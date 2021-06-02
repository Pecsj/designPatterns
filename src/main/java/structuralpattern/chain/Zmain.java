package structuralpattern.chain;

public class Zmain {
    /**
     * 责任链模式
     * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
     * 在实际场景中，财务审批就是一个责任链模式
     * 用责任链模式设计此报销流程时，每个审核者只关心自己责任范围内的请求，并且处理它。对于超出自己责任范围的，扔给下一个审核者处理
     * 这样，将来继续添加审核者的时候，不用改动现有逻辑。
     *
     */
    public static void main(String[] args) {
        //组装责任链
        Chain chain = new Chain();
        chain.addHander(new ThreeManger());
        chain.addHander(new TwoManger());
        chain.addHander(new OneManger());

        //准备消息对象
        Request request = new Request(1,"机密一级消息");
        chain.work(request);
    }
}
