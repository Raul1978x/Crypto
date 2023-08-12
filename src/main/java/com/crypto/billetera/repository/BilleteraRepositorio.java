package com.crypto.billetera.repository;

import com.crypto.billetera.entities.Billetera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BilleteraRepositorio extends JpaRepository<Billetera, Long> {
}
