package com.tsk.locationservice.repo;

import com.tsk.locationservice.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}

