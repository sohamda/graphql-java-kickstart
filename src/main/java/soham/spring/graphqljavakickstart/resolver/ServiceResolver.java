package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;

@Component
public class ServiceResolver implements GraphQLResolver<Service> {

    public Provider getProvider(Service service) {
        return service.getProvider();
    }
}
