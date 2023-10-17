package ra.business.service;

import java.util.List;

public interface IGeneric<T,E> {
    List<T> findALl();
    T findById(E id);
    void save(T t);
    void deleteById(E id);
}
