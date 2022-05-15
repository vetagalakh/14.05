package com.company.builder;

import java.util.ArrayList;

public interface Builder {


    void setWheels(int wheels);

    void setDoors(int doors);

    void setEngine(double volumeEng);

    void setName(String name);

    void setNumber(char num);

    void setPeople(ArrayList<Integer> list);
}
