package bean;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/30.
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String rule;
    private String realname;
    private String sex;
    private City city;
    private CertType certType;
    private String cert;
    private Date birthday;
    private UserType userType;
    private String content;
    private String status;
    private String loginIp;
    private String imagePath;

    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rule='" + rule + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", city=" + city +
                ", sertType=" + certType +
                ", cert='" + cert + '\'' +
                ", birthday=" + birthday +
                ", userType=" + userType +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ']';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CertType getCertType() {
        return certType;
    }

    public void setCertType(CertType sertType) {
        this.certType = sertType;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
