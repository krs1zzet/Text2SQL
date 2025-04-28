package cmdotenter.demo.sqlConverter.service;

import cmdotenter.demo.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.sqlConverter.dto.DatabaseDTO;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateChatRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateDatabaseRequest;
import cmdotenter.demo.sqlConverter.entity.Database;

import java.util.List;

public interface DatabaseService {
    public void save(CreateDatabaseRequest createDatabaseRequest);
    public DatabaseDTO findById(Long id);
    public List<DatabaseDTO> findAll();
    public void deleteById(Long id);
    public Database findByIdReturnDatabase(Long id);
}
