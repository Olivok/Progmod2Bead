package Program.repo;

import Program.model.Targy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargyRepo extends JpaRepository<Targy, Long> {

    Targy findByNev(String name);

}
