package pl.maciejszczesny.calendar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.calendar.repositories.DayRepository;

@Service
public class DayService {
    @Autowired
    DayRepository dayRepository;

    public  getAll(){
        dayRepository
    }
}
