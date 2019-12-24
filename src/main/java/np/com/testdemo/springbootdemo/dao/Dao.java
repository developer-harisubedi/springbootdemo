package np.com.testdemo.springbootdemo.dao;

import java.util.List;

public interface Dao<T> {

    void add(T t);
    void update(T t);
    void delete(Long id);
    T findById(Long id);
    List<T> findAll();



}
