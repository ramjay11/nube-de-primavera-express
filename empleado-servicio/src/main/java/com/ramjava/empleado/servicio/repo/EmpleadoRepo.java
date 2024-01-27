package com.ramjava.empleado.servicio.repo;

import com.ramjava.empleado.servicio.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {
}
