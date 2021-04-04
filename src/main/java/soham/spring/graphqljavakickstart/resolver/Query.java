package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.repository.ProviderRepository;
import soham.spring.graphqljavakickstart.repository.ServiceRepository;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ProviderRepository providerRepository;
    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> services() {
        return serviceRepository.findAll();
    }

    public Service serviceById(String id) {
        return serviceRepository.findById(Integer.parseInt(id)).get();
    }

    public List<Provider> providers() {
        return providerRepository.findAll();
    }

    public Provider providerById(String id) {
        return providerRepository.findById(Integer.parseInt(id)).get();
    }
}
