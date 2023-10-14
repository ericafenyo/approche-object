package fr.diginamic.recensement.models;

public record City(
    String name,
    int code,
    Long population,
    Region region,
    String department
) { }
