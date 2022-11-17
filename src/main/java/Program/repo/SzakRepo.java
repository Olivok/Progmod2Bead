package Program.repo;

import Program.model.Szak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SzakRepo extends JpaRepository<Szak, Long> {

    Szak findFirstByName(String szak);
}
