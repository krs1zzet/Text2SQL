package cmdotenter.demo.features.sqlConverter.service;

import cmdotenter.demo.features.sqlConverter.dto.DatabaseDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateDatabaseRequest;
import cmdotenter.demo.features.sqlConverter.entity.Database;

import java.util.List;

public interface DatabaseService {
    public void save(CreateDatabaseRequest createDatabaseRequest);
    public DatabaseDTO findById(Long id);
    public List<DatabaseDTO> findAll();
    public void deleteById(Long id);
    public Database findByIdReturnDatabase(Long id);
}
