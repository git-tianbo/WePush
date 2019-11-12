package enity;

public class Student {
    private int id;
    private String name;
    private int qq;
    private String type;
    private String time;
    private int stunum;
    private String daily;
    private String wish;
    private String senior;


    //只能通过set和get 去修改和获得9个变量的值
    public void setId(int id){

        this.id=id;
    }
    public int getid(){

        return id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname(){

        return name;
    }
    public void setqq(int qq)
    {
        this.qq=qq;
    }
    public int getqq(){
        return qq;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){

        return type;
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public String getTime(){

        return time;
    }
    public void setStunum(int stunum){

        this.stunum=stunum;
    }
    public int getstunum(){

        return stunum;
    }
    public void setDaily(String daily){
        this.daily=daily;
    }
    public String getdaily(){

        return daily;
    }
    public void setwish(String wish){

        this.wish=wish;
    }
    public String getWish()
    {
        return wish;
    }
    public void setSenior(String wish){

        this.senior=senior;
    }
    public String  getSenior() {

        return senior;
    }

    //返回表示 String 数据类型值的 String对象
    public String toString() {
        return "id=" + id + "name" + name + "qq" + qq + "type" + type
                + "time" + time + "stunum" + stunum + "daily" + daily + "wish" + wish + "senior" + senior;
    }
}
