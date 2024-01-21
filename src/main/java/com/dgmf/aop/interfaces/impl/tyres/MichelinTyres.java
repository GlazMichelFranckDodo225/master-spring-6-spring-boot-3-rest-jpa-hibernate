package com.dgmf.aop.interfaces.impl.tyres;

import com.dgmf.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle Moving with Michelin Tyres ....";
    }
}
