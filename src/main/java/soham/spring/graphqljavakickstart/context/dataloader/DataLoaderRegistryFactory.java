package soham.spring.graphqljavakickstart.context.dataloader;

import org.dataloader.BatchLoader;
import org.dataloader.DataLoaderFactory;
import org.dataloader.DataLoaderRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.service.ProviderService;

import java.util.concurrent.CompletableFuture;

@Component
public class DataLoaderRegistryFactory {

    @Autowired
    private ProviderService providerService;

    public static final String PROVIDERS_DATA_LOADER = "PROVIDERS";

    public DataLoaderRegistry buildDataLoaderRegistry() {
        var registry = new DataLoaderRegistry();
        registry.register(PROVIDERS_DATA_LOADER, DataLoaderFactory.newDataLoader(createProvidersDataLoader()));
        return registry;
    }

    private BatchLoader<Integer, Provider> createProvidersDataLoader() {
        return keys ->
                CompletableFuture.supplyAsync(() -> providerService.findProvidersByIds(keys));
    }
}
