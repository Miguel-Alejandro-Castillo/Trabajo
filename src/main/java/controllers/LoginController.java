package controllers;

import beans.LoginBean;
import models.bo.UsuarioBO;
import models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Alejandro on 4/12/2017.
 */
@Controller
public class LoginController {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    UsuarioBO usuarioBO;

    @RequestMapping(value = {"", "/", "/login"}, method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("loginBean", new LoginBean());
        return mav;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView submitLogin(@Valid @ModelAttribute("loginBean") LoginBean loginBean, BindingResult result) {
        ModelAndView mav=null;
        if (result.hasErrors()) {
            mav= new ModelAndView("login");
        }
        else{
            Usuario usuario=usuarioBO.get(loginBean.getUsuario(), loginBean.getPassword());
            if (usuario != null) {
                this.httpSession.setAttribute("Id", usuario.getId_usuario());
                this.httpSession.setAttribute("Email", usuario.getEmail());
                mav= new ModelAndView("redirect:/home");
            }
            else {
                mav = new ModelAndView("login");
                mav.addObject("message", "usuario o contraseña invalida");
            }
        }
        return mav;
    }
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
            ModelAndView mav = new ModelAndView("redirect:/login");
            HttpSession session=request.getSession();
            session.invalidate();
            return mav;
    }

}
