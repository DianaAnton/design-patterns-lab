package ro.uvt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.repository.AuthorRepository;
import ro.uvt.models.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    AuthorRepository authRepo;

    @Autowired
    public AuthorController(AuthorRepository authRepo) {
        this.authRepo = authRepo;
    }

    @GetMapping("/getAuthors")
    public ResponseEntity<List<Author>> getAuthors() {
        List<Author> authors = null;
        authors = authRepo.findAll();
        return new ResponseEntity<List<Author>>(authors, HttpStatus.OK);
    }

    @PostMapping("/addNewAuthor")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        Author author1 = null;
        try {
            author1 = authRepo.save(author);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Author>(author1, HttpStatus.OK);
    }

}
