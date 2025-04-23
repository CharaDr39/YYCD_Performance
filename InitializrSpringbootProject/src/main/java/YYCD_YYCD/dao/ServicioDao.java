package YYCD_YYCD.dao;

import YYCD_YYCD.domain.Servicio;      // importa la entidad Servicio
import org.springframework.data.jpa.repository.JpaRepository; // importa JPA para CRUD
import java.util.List;                 // importa List (para usar en consultas, si hace falta)

public interface ServicioDao extends JpaRepository<Servicio, Long> { 
    // interfaz que hereda métodos para guardar, buscar y borrar Servicios
}
