package com.dgmf.practicebeansautowiringanddi.interfaces.impl.tyres;

import com.dgmf.practicebeansautowiringanddi.interfaces.Tyres;
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
