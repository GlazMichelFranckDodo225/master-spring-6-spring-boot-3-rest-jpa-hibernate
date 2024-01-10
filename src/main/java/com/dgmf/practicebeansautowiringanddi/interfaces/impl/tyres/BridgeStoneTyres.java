package com.dgmf.practicebeansautowiringanddi.interfaces.impl.tyres;

import com.dgmf.practicebeansautowiringanddi.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle Moving with BridgeStone Tyres ....";
    }
}
