package pl.teamxd.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.teamxd.model.Location;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Repository
@RequiredArgsConstructor
public class MockData {
    private final LocationRepository locationRepository;

    @PostConstruct
    public void init(){
        Location location1 = Location.builder()
                .lat(125.00)
                .lat(125.00)
                .note("Tutaj doszedlem :-)")
                .date(LocalDateTime.now())
                .rate(5)
                .build();
        locationRepository.save(location1);
    }
}