package controllers;

import beans.TareaBean;
import beans.UsuarioBean;
import models.bo.TareaBO;
import models.bo.UsuarioBO;
import models.dao.IDaoUsuario;
import models.entities.Tarea;
import models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Alejandro on 5/12/2017.
 */
@Controller
public class HomeController {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    TareaBO tareaBO;
    @Autowired
    UsuarioBO usuarioBO;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
        return "home";
    }

    @RequestMapping(value = "/create_task", method = RequestMethod.GET)
    public ModelAndView showCreateTaskForm(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("create_task");
        mav.addObject("tareaBean", new TareaBean());
        return mav;
    }
    @RequestMapping(value = "/create_task", method = RequestMethod.POST)
    public ModelAndView submitCreateTaskForm(@Valid @ModelAttribute("tareaBean") TareaBean tareaBean, BindingResult result) {
        ModelAndView mav=null;
        if(result.hasErrors()){
            mav= new ModelAndView("create_task");
        }
        else{
            mav= new ModelAndView("redirect:/home");
            Long id= (Long) httpSession.getAttribute("Id");
            Usuario usuario=usuarioBO.get(id);
            Tarea tarea=new Tarea(tareaBean.getTitulo(),tareaBean.getFecha_vencimiento(),tareaBean.getDescripcion(), usuario);
            tareaBO.save(tarea);
        }
        return mav;
    }

    @RequestMapping(value = "/list_tasks", method = RequestMethod.GET)
    public ModelAndView list_tasks() {
        ModelAndView mav=new ModelAndView("list_tasks");
        List<Tarea> tareas=tareaBO.list();
        mav.addObject("tareas", tareas);
        return mav;
    }

}
