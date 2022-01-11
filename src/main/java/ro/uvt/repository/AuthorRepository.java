package ro.uvt.repository;
import ro.uvt.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
