package soham.spring.graphqljavakickstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.error.NoDataFoundError;
import soham.spring.graphqljavakickstart.repository.ProviderRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> findAllProviders() {
        return providerRepository.findAll();
    }

    public Provider findProviderById(String providerId) {
        Optional<Provider> provider = providerRepository.findById(Integer.parseInt(providerId));

        if(provider.isEmpty()) {
            throw new NoDataFoundError("No Provider found", "PRV-001");
        }
        return provider.get();
    }

    public List<Provider> findProvidersByIds(List<Integer> ids) {
        return providerRepository.findByIdIn(ids);
    }

    public Provider addProvider(String name, String description) {
        Integer maxId = providerRepository.maxId();

        return providerRepository.save(Provider.builder().id(maxId+1).name(name).description(description).build());
    }
}
