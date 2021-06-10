package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.developers.appwarehouse.entity.warehouseEntity.Supplier;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    boolean existsByName(String name);
    boolean existsByPhoneNumber(String phoneNumber);

}
