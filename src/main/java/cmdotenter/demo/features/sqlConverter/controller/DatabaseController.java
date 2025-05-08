package cmdotenter.demo.features.sqlConverter.controller;

import cmdotenter.demo.features.sqlConverter.dto.ChatDTO;
import cmdotenter.demo.features.sqlConverter.dto.DatabaseDTO;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateDatabaseRequest;
import cmdotenter.demo.features.sqlConverter.service.DatabaseService;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DatabaseController {

    private final static Logger log = org.slf4j.LoggerFactory.getLogger(DatabaseController.class);

    private final DatabaseService databaseService;

    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @GetMapping("/database")
    public ResponseEntity<List<DatabaseDTO>> getAllDatabases() {
        List<DatabaseDTO> databaseDTOList = databaseService.findAll();
        log.info("Find all databases");
        return ResponseEntity.ok(databaseDTOList);
    }
    @PostMapping("/database")
    public ResponseEntity<Void> createDatabase(@RequestBody CreateDatabaseRequest createDatabaseRequest) {
        databaseService.save(createDatabaseRequest);
        log.info("Database saved");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/database/{id}")
    public ResponseEntity<Void> deleteDatabase(@PathVariable Long id) {
        databaseService.deleteById(id);
        log.info("Database deleted");
        return ResponseEntity.ok().build();
    }
    @PutMapping("/database/{id}")
    public ResponseEntity<Void> updateDatabase(@PathVariable Long id, @RequestBody CreateDatabaseRequest createDatabaseRequest) {
        databaseService.updateById(id, createDatabaseRequest);
        log.info("Database updated");
        return ResponseEntity.ok().build();
    }
    @GetMapping("/chat/database/{id}")
    public ResponseEntity<DatabaseDTO> getDatabaseByChatId(@PathVariable Long id) {
        DatabaseDTO databaseDTO = databaseService.findDatabaseByChatId(id);
        log.info("Find all chat by database id");
        return ResponseEntity.ok(databaseDTO);
    }
}
