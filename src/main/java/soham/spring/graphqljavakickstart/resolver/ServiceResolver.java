package soham.spring.graphqljavakickstart.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.context.dataloader.DataLoaderRegistryFactory;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;

import java.util.concurrent.CompletableFuture;

@Component
public class ServiceResolver implements GraphQLResolver<Service> {

    public CompletableFuture<Provider> getProvider(Service service, DataFetchingEnvironment environment) {

        DataLoader<Integer, Provider> dataLoader = environment
                .getDataLoader(DataLoaderRegistryFactory.PROVIDERS_DATA_LOADER);
        return dataLoader.load(service.getProviderId());
    }
}
