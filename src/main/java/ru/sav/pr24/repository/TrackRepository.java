package ru.sav.pr24.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sav.pr24.domain.Track;

public interface TrackRepository extends CrudRepository<Track, Long> {
}
