package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.repository.ServiceRepository;

import java.util.List;

@Component
public class ProviderResolver implements GraphQLResolver<Provider> {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getServices(Provider provider) {
        return serviceRepository.findAllByProvider(provider);
    }
}
