package com.dgmf.aop.interfaces.impl.tyres;

import com.dgmf.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle Moving with BridgeStone Tyres ....";
    }
}
