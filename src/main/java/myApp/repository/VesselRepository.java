package myApp.repository;

import myApp.model.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VesselRepository extends JpaRepository<Vessel, Integer> {
}
