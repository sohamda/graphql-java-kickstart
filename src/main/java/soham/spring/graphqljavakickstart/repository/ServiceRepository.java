package soham.spring.graphqljavakickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import soham.spring.graphqljavakickstart.entity.Service;

import java.util.List;

@Transactional
public interface ServiceRepository extends JpaRepository<Service, Integer> {

    public List<Service> findAllByProviderId(Integer providerId);

    @Query(value = "SELECT max(id) FROM Service")
    Integer maxId();
}
