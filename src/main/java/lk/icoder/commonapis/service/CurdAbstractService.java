package lk.icoder.commonapis.service;

import java.util.List;

public interface CurdAbstractService<T> {
    List<T> findAll();

    T findById(Long id);

    T save(T t);

    void deleteById(Long id);
}
