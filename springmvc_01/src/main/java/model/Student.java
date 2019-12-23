package model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public class Student {

    private long id;

//    验证字符串非空，且长度必须大于0
    @NotBlank( message = "student.name.null")
    private String name;

    //不为空
    @NotNull( message = "student.qq.null")
    private int qq;

    //    验证字符串非空，且长度必须大于0
    @NotBlank( message = "student.type.null")
    private String type;

    //    验证字符串非空，且长度必须大于0
    @NotBlank( message = "student.time.null")
    private String time;

    //最大值不超过30
    @Max(value=30, message = "student.stunum.max")
    private int stunum;

    private String daily;

    private String wish;

    private String senior;


    public void setId(long id) {
        this.id = id;
    }

    public long getid() {
        return id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {

        return name;
    }

    public void setqq(int qq) {
        this.qq = qq;
    }

    public int getqq() {
        return qq;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {

        return time;
    }

    public void setStunum(int stunum) {

        this.stunum = stunum;
    }

    public int getstunum() {

        return stunum;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }

    public String getdaily() {

        return daily;
    }

    public void setwish(String wish) {

        this.wish = wish;
    }

    public String getWish() {
        return wish;
    }

    public void setSenior(String wish) {

        this.senior = senior;
    }

    public String getSenior() {

        return senior;
    }

    //返回表示 String 数据类型值的 String对象
    public String toString() {
        return "id=" + id + "name" + name + "qq" + qq + "type" + type
                + "time" + time + "stunum" + stunum + "daily" + daily
                + "wish" + wish + "senior" + senior;
    }
}
