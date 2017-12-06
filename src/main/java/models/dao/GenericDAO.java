package models.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alejandro on 4/12/2017.
 */
public interface GenericDAO<T>{
    public void save(T entity);
    public void update(T entity);
    public void delete(Long id);
    public T get(Long id);
    public List<T> list();
}
