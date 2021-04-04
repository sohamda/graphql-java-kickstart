package soham.spring.graphqljavakickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soham.spring.graphqljavakickstart.entity.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

}
