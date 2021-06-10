package uz.developers.appwarehouse.repository.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.developers.appwarehouse.entity.warehouseEntity.Client;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client,Long> {

    boolean existsByName(String name);

    boolean existsByPhoneNumber(String phoneNumber);

}
