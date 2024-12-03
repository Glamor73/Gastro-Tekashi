package co.edu.Finanzas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AhorroRepository extends JpaRepository<Ahorro, Long> {
    // Puedes agregar consultas personalizadas aquí si lo necesitas
}
