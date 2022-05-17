package com.gcastellini.miportfolio.services;

import com.gcastellini.miportfolio.models.Idiomas;

public interface LangService {
	Idiomas listarLang(long id);
	Idiomas addLang(Idiomas i);
	Idiomas editLang(Idiomas i);
	Idiomas deleteLang(long id);
}
