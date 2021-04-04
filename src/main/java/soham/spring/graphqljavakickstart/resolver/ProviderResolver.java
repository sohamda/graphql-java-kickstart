package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.service.ServicesService;

import java.util.List;

@Component
public class ProviderResolver implements GraphQLResolver<Provider> {

    @Autowired
    private ServicesService service;

    public List<Service> getServices(Provider provider) {
        return service.findProviderOfService(provider);
    }
}
