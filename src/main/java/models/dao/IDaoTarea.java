package models.dao;

import models.entities.Tarea;

import java.util.List;

/**
 * Created by Alejandro on 4/12/2017.
 */
public interface IDaoTarea extends GenericDAO<Tarea>{
 public List<Tarea> list(Long id);
}
