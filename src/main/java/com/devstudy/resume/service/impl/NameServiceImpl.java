package com.devstudy.resume.service.impl;

import com.devstudy.resume.service.NameService;
import org.apache.commons.lang3.text.WordUtils;

public class NameServiceImpl implements NameService {
    @Override
    public String convertName(String name) {
        if (name.contains("-")) {
            String[] parts = name.split("-");

            return WordUtils.capitalize(parts[0]) + " " + WordUtils.capitalize(parts[1]);
        }

        return WordUtils.capitalize(name);
    }
}
