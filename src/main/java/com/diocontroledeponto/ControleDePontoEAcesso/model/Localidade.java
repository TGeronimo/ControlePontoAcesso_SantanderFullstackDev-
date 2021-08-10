package com.diocontroledeponto.ControleDePontoEAcesso.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    private String descricao;
    @OneToMany
    private NivelAcesso nivelAcesso;

}
