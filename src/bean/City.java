package bean;

/**
 * Created by Administrator on 2017/7/30.
 */
public class City {
    private Integer id;
    private String cityId;
    private String city;
    private Province province;
    private String father;

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", province=" + province +
                ", father='" + father + '\'' +
                '}';
    }
}
