package com.crypto.billetera.repository;

import com.crypto.billetera.entities.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepositorio extends JpaRepository<Moneda, Long> {
}
