package biz;

import bean.User;

import java.util.List;

/**
 * Created by Administrator on 2017/7/30.
 */
public interface LoginBiz {
    public boolean checkLogin(User u);
    public User currentUser(String name);

    //查询数量份方法
    public int userNumBiz();
    public List<User> pageUsers(int start,int end);

}
