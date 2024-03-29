package tgr.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarsRepository extends JpaRepository<Cars,Long> {

    @Override
    Optional<Cars> findById(Long aLong);
}
