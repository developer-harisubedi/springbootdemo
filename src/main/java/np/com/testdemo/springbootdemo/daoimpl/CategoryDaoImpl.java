package np.com.testdemo.springbootdemo.daoimpl;

import np.com.testdemo.springbootdemo.dao.Dao;
import np.com.testdemo.springbootdemo.model.Category;
import np.com.testdemo.springbootdemo.repoitory.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryDaoImpl implements Dao<Category> {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void add(Category category) {
        categoryRepository.saveAndFlush(category);
    }

    @Override
    public void update(Category category) {

            categoryRepository.saveAndFlush(category);


    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
