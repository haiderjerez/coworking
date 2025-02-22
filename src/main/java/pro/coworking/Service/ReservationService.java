package pro.coworking.Service;

import pro.coworking.dto.ReservationDTO;
import pro.coworking.Entity.Reservation;
import pro.coworking.Repository.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<ReservationDTO> getAllReservations() {
        return reservationRepository.findAll().stream()
                .map(res -> new ReservationDTO(res.getId(), res.getUserName(), res.getSpaceId().getId(), res.getStartTime(), res.getEndTime()))
                .collect(Collectors.toList());
    }

    public Reservation createReservation(Reservation reservation2) {
        Reservation reservation = new Reservation();
        reservation.setUserName(reservation2.getUserName());
        reservation.setStartTime(reservation2.getStartTime());
        reservation.setEndTime(reservation2.getEndTime());
        reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
