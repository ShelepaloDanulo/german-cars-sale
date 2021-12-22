package edu.kpi.iasa.mmsa.bd.car.delership.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Error {
    String code;
    String description;
}
