package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.developers.appwarehouse.entity.warehouseEntity.Product;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Long> {

    Page<Product> findAllByCategoryIdAndActiveIsTrue(Long category_id,  Pageable pageable);

    boolean existsByNameAndCategoryId(String name, Long category_id);
}
