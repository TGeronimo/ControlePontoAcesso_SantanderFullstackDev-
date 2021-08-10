package com.diocontroledeponto.ControleDePontoEAcesso.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocorrencia {
    private long id;
    private String nome;
    private String descricao;

}
