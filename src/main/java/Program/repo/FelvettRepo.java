package Program.repo;

import Program.model.Felvett;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FelvettRepo extends JpaRepository<Felvett, Long> {



}