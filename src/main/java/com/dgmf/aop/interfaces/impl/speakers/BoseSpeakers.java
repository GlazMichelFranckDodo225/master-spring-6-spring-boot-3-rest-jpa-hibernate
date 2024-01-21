package com.dgmf.aop.interfaces.impl.speakers;

import com.dgmf.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing Music with Bose Speakers ...";
    }
}
