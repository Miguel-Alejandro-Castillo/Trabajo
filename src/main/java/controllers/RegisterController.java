package controllers;

import beans.UsuarioBean;
import models.bo.UsuarioBO;
import models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import util.ValidatorRegisterBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by Alejandro on 5/12/2017.
 */
@Controller
public class RegisterController {
    @Autowired
    UsuarioBO usuarioBO;
    @Autowired
    private ValidatorRegisterBean validatorRegisterBean;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(validatorRegisterBean);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("usuarioBean", new UsuarioBean());
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView submitRegister(@Valid @ModelAttribute("usuarioBean") UsuarioBean usuarioBean, BindingResult result) {
        ModelAndView mav=null;
        if(result.hasErrors()){
            mav= new ModelAndView("register");
        }
        else{
            mav= new ModelAndView("redirect:/login");
            Usuario usuario=new Usuario(usuarioBean.getNombre(),usuarioBean.getApellido(),usuarioBean.getEmail(),usuarioBean.getPassword());
            usuarioBO.save(usuario);
        }
        return mav;
    }
}
