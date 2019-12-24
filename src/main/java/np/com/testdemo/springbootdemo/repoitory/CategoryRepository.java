package np.com.testdemo.springbootdemo.repoitory;


import np.com.testdemo.springbootdemo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
