package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.developers.appwarehouse.entity.warehouseEntity.Currency;
@RepositoryRestResource(path = "currency")
public interface CurrencyRepository extends JpaRepository<Currency,Long> {
    boolean existsByName(String name);
}
