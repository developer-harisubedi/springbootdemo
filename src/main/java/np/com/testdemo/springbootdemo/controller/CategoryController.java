package np.com.testdemo.springbootdemo.controller;


import np.com.testdemo.springbootdemo.daoimpl.CategoryDaoImpl;
import np.com.testdemo.springbootdemo.model.Category;
import np.com.testdemo.springbootdemo.repoitory.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryDaoImpl categoryDao;

@RequestMapping(value = "/categories", method = RequestMethod.GET)
   public List<Category> getAllCategory(){
    return categoryDao.findAll();
}

@RequestMapping(value = "/categories",method = RequestMethod.POST)
    public void saveCategory(@RequestBody Category category){
    categoryDao.add(category);
}


    @RequestMapping(value = "/categories/{id}",method = RequestMethod.PUT)
    public void saveCategory(@RequestBody Category category,@PathVariable Long id){
        categoryDao.update(category);
    }

}
