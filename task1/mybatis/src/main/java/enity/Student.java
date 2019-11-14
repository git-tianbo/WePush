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

    public int getId() {
        return id;
    }
    public void setId(int id){

        this.id=id;
    }
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name=name;
    }
    public int getqq(){

        return qq;
    }
    public void setqq(int qq) {

        this.qq=qq;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type){

        this.type=type;
    }
    public String getTime() {

        return time;
    }
    public void setTime(String time ){
        this.time=time; }

    public int getstunum() {

        return stunum;
    }
    public void setstunum(int stunum){
        this.stunum=stunum; }

    public String getdaily(){
        return daily;
    }
    public void setdaily(String daily){

        this.daily=daily;
    }
    public String getWish() {

        return wish;
    }
    public void setWish(String wish) {

        this.wish=wish;
    }
    public String getsenior(){

        return senior;
    }
    public void setsenior(String senior){

        this.senior=senior;
    }

    //String to string     toString返回此对象本身（它已经是一个字符串）

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", qq=" + qq + ", type=" + type + ", time=" + time + ", stunum=" + stunum + ", daily=" + daily + ", wish=" + wish + ", senior=" + senior +"]";
    }
}






