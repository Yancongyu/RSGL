package bean;

/**
 * Created by Administrator on 2017/8/5.
 */
public class Paging {
    private int totalRow;
    private int showNum;
    private int totalPage;
    private int reqPage;
    private int start;
    private int end;
    private int next;
    private int previous;

    public Paging(){}

    public Paging(int totalRow,int showNum){
        this.totalRow = totalRow;
        this.showNum = showNum;
        if(this.totalRow%this.showNum ==0){
            this.totalPage = this.totalRow/this.showNum;
        }
        else {
            this.totalPage = this.totalRow/this.showNum + 1;
        }
    }

    //进行分页
    public void doPaging(int reqPage){
        this.reqPage = reqPage;
        this.start = (this.reqPage-1)*this.showNum + 1;
        this.end = this.start * this.showNum;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public int getShowNum() {
        return showNum;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getReqPage() {
        return reqPage;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getNext() {
        return next;
    }

    public int getPrevious() {
        return previous;
    }


}
