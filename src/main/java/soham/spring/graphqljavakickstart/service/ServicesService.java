package soham.spring.graphqljavakickstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import soham.spring.graphqljavakickstart.entity.Provider;
import soham.spring.graphqljavakickstart.entity.Service;
import soham.spring.graphqljavakickstart.error.NoDataFoundError;
import soham.spring.graphqljavakickstart.repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServicesService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> findAllServices() {
        return serviceRepository.findAll();
    }

    public Service findServiceById(String serviceId) {
        Optional<Service> service = serviceRepository.findById(Integer.parseInt(serviceId));

        if(service.isEmpty()) {
            throw new NoDataFoundError("No Provider found", "SER-001");
        }
        return service.get();
    }

    public List<Service> findProviderOfService(Provider provider) {
        return serviceRepository.findAllByProviderId(provider.getId());
    }
}
