package models.bo;

import models.dao.IDaoTarea;

import models.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Alejandro on 6/12/2017.
 */
public class TareaBO {
    @Autowired
    private IDaoTarea daoTarea;
    public void save(Tarea tarea) {
        daoTarea.save(tarea);
    }

    public List<Tarea> list() {
        return daoTarea.list();
    }
}
