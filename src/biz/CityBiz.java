package biz;

import bean.City;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface CityBiz {
    public List<City> selectCityBiz(String pid);
}
