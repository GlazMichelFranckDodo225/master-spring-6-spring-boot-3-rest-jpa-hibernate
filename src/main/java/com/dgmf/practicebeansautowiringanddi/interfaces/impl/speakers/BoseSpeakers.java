package com.dgmf.practicebeansautowiringanddi.interfaces.impl.speakers;

import com.dgmf.practicebeansautowiringanddi.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing Music with Bose Speakers ...";
    }
}
