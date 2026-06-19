package telemetry_service.telemetry.application.outboundservices.acl;

import org.springframework.stereotype.Service;

/**
 * Mock implementation of ExternalEquipmentService to allow the Spring context to load.
 * TODO: Replace this with an actual REST client (RestTemplate/Feign) calling the equipment-service.
 */
@Service
public class ExternalEquipmentServiceMockImpl implements ExternalEquipmentService {

    @Override
    public String getSpeciesByPondId(Long pondId) {
        return "TRUCHA"; // Mock data
    }

    @Override
    public Long getUserIdByPondId(Long pondId) {
        return 1L; // Mock data
    }

    @Override
    public Long getOperatorIdByPondId(Long pondId) {
        return 1L; // Mock data
    }
}
