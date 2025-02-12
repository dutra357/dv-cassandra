package com.dutra.cassamdra.model.embedded;

import com.dutra.cassamdra.model.enums.PropType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("prop")
public class Prop {

    private String name;
    private String valor;
    private PropType type;

    public Prop() {}
    public Prop(String name, String valor, PropType type) {
        this.name = name;
        this.valor = valor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public PropType getType() {
        return type;
    }

    public void setType(PropType type) {
        this.type = type;
    }
}
