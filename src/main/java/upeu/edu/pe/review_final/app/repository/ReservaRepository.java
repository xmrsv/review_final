package upeu.edu.pe.review_final.app.repository;

import upeu.edu.pe.review_final.infrastructure.entity.ReservaEntity;

public interface ReservaRepository {
    // Ver reservas
    Iterable<ReservaEntity> getReservas();

    // Ver reserva por id
    ReservaEntity getReservasById(Integer id);

    // Guardar reserva
    ReservaEntity saveReserva(ReservaEntity reservaEntity);

    // Borrar reserva
    void deleteReservaById(Integer id);
}
