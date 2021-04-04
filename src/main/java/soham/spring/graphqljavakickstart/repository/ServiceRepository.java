package soham.spring.graphqljavakickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Integer> {

    public List<Service> findAllByProvider(Provider provider);
}
