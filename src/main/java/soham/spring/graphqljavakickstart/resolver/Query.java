package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.service.ProviderService;
import soham.spring.graphqljavakickstart.service.ServicesService;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ProviderService providerService;
    @Autowired
    private ServicesService service;

    public List<Service> services() {
        return service.findAllServices();
    }

    public Service serviceById(String id) {
        return service.findServiceById(id);
    }

    public List<Provider> providers() {
        return providerService.findAllProviders();
    }

    public Provider providerById(String id) {
        return providerService.findProviderById(id);
    }
}
