package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.developers.appwarehouse.entity.warehouseEntity.Category;

import java.util.List;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category,Long> {

    List<Category> findAllByCategoryIdAndActiveIsTrue(Long id);

    boolean existsByNameAndCategoryId(String name, Long category_id);

    boolean existsByName(String name);
}
