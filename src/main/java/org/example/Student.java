package org.example;

import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data //<- Getter/Setter/Equals&Hashcode/toString
    @AllArgsConstructor //<- Konstruktor mit allen Werten!
    @NoArgsConstructor //<- Konstruktor ohne Werte
//@RequiredArgsConstructor//<- Konstruktor der nur final Felder befüllt
    @Builder//<-Ermöglicht Builder Pattern, also einen universal Konstruktor

public class Student {

    private String id;
    private String name;
    private String address;
    private int grade;
}
