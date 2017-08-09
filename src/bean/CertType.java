package bean;

/**
 * Created by Administrator on 2017/7/30.
 */
public class CertType {
    private Integer id;
    private String content;

    @Override
    public String toString() {
        return "CertType[" +
                "id=" + id +
                ", content='" + content + '\'' +
                ']';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
