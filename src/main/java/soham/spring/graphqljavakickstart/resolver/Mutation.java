package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.service.ProviderService;
import soham.spring.graphqljavakickstart.service.ServicesService;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private ProviderService providerService;
    @Autowired
    private ServicesService servicesService;

    public Service addService(String name, String description, String providerId) {
        return servicesService.addService(name, description, providerId);
    }

    public Provider addProvider(String name, String description) {
        return providerService.addProvider(name, description);
    }
}
