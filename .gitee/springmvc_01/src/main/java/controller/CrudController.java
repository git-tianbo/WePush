package controller;

import dao.StudentDao;
import model.Student;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//控制器类     把controllers 注册到到ioc容器里
@Controller
@RequestMapping(path="/Student")
public class CrudController {
    Logger logger = Logger.getLogger(CrudController.class);

    @Autowired
    StudentDao studentDao;
//@RequestMapping 注解得作用    建立请求url和处理请求方法之间的对应关系

    //1.  path（value）  设置方法名，类中  方法均可
//方便处理映射器（handlerMapping）调用   返回给前端控制器(DispatcherServlet)
//
//2.params  指定前端传入参数必须有此项内容
//
//3.method  指定请求方式（post put get delete）


    //通过id查询学生

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView searchById(@PathVariable("id") long id) {
        ModelAndView mv = new ModelAndView();
        logger.info("该用户的id为" + id);
        Student s = new Student();
        s.setId(id);
        s.setname("第一个");
        s.setqq(1111);
        s.setType("前端");
        s.setTime("8月2日入学");
        s.setStunum(11111);
        s.setDaily("www.ptteng.com/daily=2588");
        s.setwish("成为程序员");
        s.setSenior("王庆");
        mv.addObject("s", s);
        mv.addObject("code", 1);
        mv.addObject("message", "成功");
        mv.setViewName("getid");
        return mv;
    }


    //以下部分是增加代码

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView postform() {
        ModelAndView mv = new ModelAndView("postform");
            return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView insertStudent(@ModelAttribute Student student){
        ModelAndView mv = new ModelAndView("postStudent");
        logger.info(student);
        Student s1 = new Student();
        s1.setId(student.getid());
        s1.setname(student.getname());
        s1.setqq(student.getqq());
        s1.setType(student.getType());
        s1.setTime(student.getTime());
        s1.setStunum(student.getstunum());
        s1.setDaily(student.getdaily());
        s1.setwish(student.getWish());
        s1.setSenior(student.getSenior());
        logger.info(s1);
        mv.addObject("s1",s1);
        mv.addObject("code", 1);
        mv.addObject("message", "添加成功");
        return mv;
    }
}