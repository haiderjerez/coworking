package pro.coworking.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pro.coworking.Entity.Reservation;
import pro.coworking.Service.ReservationService;
import pro.coworking.dto.ReservationDTO;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")  // La ruta debe coincidir con tu API_URL
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // ✅ Maneja POST correctamente
    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        Reservation newReservation = reservationService.createReservation(reservation);
        return ResponseEntity.ok(newReservation);
    }

    // ✅ Maneja GET para listar reservas
    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getAllReservations() {
        return ResponseEntity.ok(reservationService.getAllReservations());
    }

    // ✅ Maneja DELETE correctamente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return ResponseEntity.noContent().build();
    }
}


