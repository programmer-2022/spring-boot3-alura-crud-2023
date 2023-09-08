package com.yrsoftware.api.clinical.repository;

import com.yrsoftware.api.clinical.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
