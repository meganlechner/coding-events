package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.ReportAsSingleViolation;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
