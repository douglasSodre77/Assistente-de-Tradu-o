package com.example.backend_float_translator.Controller;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {

    // Aqui você colocaria sua chave da API do Google Cloud futuramente
    private final String API_KEY = "SUA_CHAVE_AQUI";

    public String traduzir(String texto, String idiomaDestino) {
        try {
            Translate translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();

            Translation translation = translate.translate(
                    texto,
                    Translate.TranslateOption.targetLanguage(idiomaDestino)
            );

            return translation.getTranslatedText();
        } catch (Exception e) {
            return "Erro na tradução: " + e.getMessage();
        }
    }
}