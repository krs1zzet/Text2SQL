package cmdotenter.demo.features.sqlConverter.service.Impl;

import cmdotenter.demo.features.sqlConverter.dto.DatabaseDTO;
import cmdotenter.demo.features.sqlConverter.dto.converter.DatabaseDTOConverter;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateDatabaseRequest;
import cmdotenter.demo.features.sqlConverter.entity.Database;
import cmdotenter.demo.features.sqlConverter.repo.DatabaseRepository;
import cmdotenter.demo.features.sqlConverter.service.ChatService;
import cmdotenter.demo.features.sqlConverter.service.DatabaseService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatabaseServiceImpl implements DatabaseService {

    private final ChatService chatService;
    private final DatabaseRepository databaseRepository;
    private final DatabaseDTOConverter databaseDTOConverter;

    public DatabaseServiceImpl(ChatService chatService, DatabaseRepository databaseRepository, DatabaseDTOConverter databaseDTOConverter) {
        this.chatService = chatService;
        this.databaseRepository = databaseRepository;
        this.databaseDTOConverter = databaseDTOConverter;
    }

    @Transactional
    @Override
    public void save(CreateDatabaseRequest createDatabaseRequest) {
        Database database = new Database();
        database.setDataText(createDatabaseRequest.getDataText());
        database.setSchemaText(createDatabaseRequest.getSchemaText());
        database.setChat(chatService.findByIdReturnChat(createDatabaseRequest.getChatId()));
        databaseRepository.save(database);

    }

    @Override
    public DatabaseDTO findById(Long id) {
        Optional<Database> database = databaseRepository.findById(id);
        Database databaseEntity = database.orElseThrow(() -> new RuntimeException("Database not found"));
        return databaseDTOConverter.convert(databaseEntity);
    }

    @Override
    public List<DatabaseDTO> findAll() {
        return databaseDTOConverter.convert(databaseRepository.findAll());
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        Database database = databaseRepository.findById(id).orElse(null);
        database.getChat().setDatabase(null); // ilişkisini koparıyoruz
        if (database != null) {
            databaseRepository.delete(database);
        } else {
            throw new RuntimeException("Database not found");
        }
    }

    @Override
    public Database findByIdReturnDatabase(Long id) {
        return databaseRepository.findById(id).orElseThrow(() -> new RuntimeException("Database not found"));
    }
}
