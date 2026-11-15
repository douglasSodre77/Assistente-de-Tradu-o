package com.example.backend_float_translator.TraducaoRepository;

import com.example.backend_float_translator.BackendFloatTranslatorApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraducaoRepository extends JpaRepository<BackendFloatTranslatorApplication.Traducao, Long> {
    // Aqui o Spring já cria o Save, Delete e Find automaticamente
}