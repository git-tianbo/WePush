package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class  advice {

    @Autowired
    private MessageSource messageSource;


    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception e) {

        String message = e.getMessage();

        String error = messageSource.getMessage(message,null, null);

        ModelAndView mv = new ModelAndView("fail");
        mv.addObject("error", error);
        return mv;
    }
}
