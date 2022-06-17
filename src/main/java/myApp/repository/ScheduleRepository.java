package myApp.repository;

import myApp.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    @Query("select s from Schedule s where s.status not like 'SAILED'")
    List<Schedule> findNotSailedVessels();

    @Query("select s from Schedule s where s.status = 'SAILED'")
    List<Schedule> findSailedVessels();
}
