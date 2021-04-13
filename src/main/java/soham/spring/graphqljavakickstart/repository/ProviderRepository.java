package soham.spring.graphqljavakickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.graphqljavakickstart.entity.Provider;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

    List<Provider> findByIdIn(List<Integer> ids);
}
