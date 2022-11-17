package Program.repo;

import Program.model.Diak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiakRepo extends JpaRepository<Diak, Long> {

}
