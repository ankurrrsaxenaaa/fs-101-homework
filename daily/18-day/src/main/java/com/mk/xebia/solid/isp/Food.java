package com.mk.xebia.solid.isp;

import java.util.Date;
import java.util.List;

public interface Food {

    float getCalories();
    float getCarbohydrates();
    float getFats();
    float getProteins();
    List<String> getVitamins();
    List<String> getMinarals();
    Date cropYear();
}
